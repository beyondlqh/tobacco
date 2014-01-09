package com.iotsec.tobacco.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iotsec.tobacco.db.DBUtil;
import com.iotsec.tobacco.javabean.Record;
import com.iotsec.tobacco.security.DES;
import com.iotsec.tobacco.security.DESede;

/**
 * Servlet implementation class Shifang
 */
public class Shifang extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Shifang() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("c").substring(0, 2);
		String idmiwen = request.getParameter("c").substring(2);
		String idmingwen = null;
		String code = request.getParameter("p");
		try {
			if (flag.equals("00")) {
				idmingwen = DES.getInstance().de(idmiwen);
			} else {
				idmingwen = DESede.getInstance().de(idmiwen);
			}		
			
		} catch (Exception e) {

			request.setAttribute("i", "0");
			request.getRequestDispatcher("state.jsp")
					.forward(request, response);
			return;
		}
		Session session = DBUtil.getInstance().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			org.hibernate.Query query = session
					.createQuery("from Record r where r.PID= :pid");
			query.setParameter("pid", idmingwen,
					new org.hibernate.type.StringType());
			ArrayList<Record> list = (ArrayList<Record>) query.list();
			tx.commit();
			if (list == null) {

				request.setAttribute("i", "0");
				request.getRequestDispatcher("state.jsp").forward(request,
						response);
				return;
			}
			if (list.get(0).getCode() == null
					|| list.get(0).getCode().equals("")) {
				request.setAttribute("i", "1");
				request.getRequestDispatcher("state.jsp").forward(request,
						response);
				return;
			}
			if (list.get(0).getCode().equals(code)) {
				tx = session.beginTransaction();
				Record r = (Record) session.get(Record.class, list.get(0).getId());
				r.setCode("");
				tx.commit();
				request.setAttribute("i", "1");
				request.getRequestDispatcher("state.jsp").forward(request,
						response);
				return;
			} else {
				request.setAttribute("i", "0");
				request.getRequestDispatcher("state.jsp").forward(request,
						response);
				return;
			}

		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;
		} finally {
			session.close();
		}
	}

}

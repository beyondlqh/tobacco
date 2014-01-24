package com.iotsec.tobacco.servlet;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iotsec.tobacco.db.DBUtil;
import com.iotsec.tobacco.javabean.Record;

/**
 * Servlet implementation class Add
 */

public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Add() {
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
		request.setCharacterEncoding("UTF-8");
		String ID = request.getParameter("PID");
		String Name = request.getParameter("Name");
		String Factory = request.getParameter("Factory");
		String Date = request.getParameter("Date");
		String Batch = request.getParameter("Batch");
		String CryptoFlag = request.getParameter("CryptoFlag");

		Record record = new Record(ID, Name, Factory, Date, Batch, CryptoFlag,
				"",0);

		Session session = DBUtil.getInstance().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(record);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;
		} finally {
			session.close();
		}

		request.getRequestDispatcher("add.jsp").forward(request, response);
	}

}

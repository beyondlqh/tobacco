package com.iotsec.tobacco.servlet;

import com.iotsec.tobacco.db.DBUtil;
import com.iotsec.tobacco.javabean.Record;
import com.iotsec.tobacco.security.DES;
import com.iotsec.tobacco.security.DESede;
import com.iotsec.tobacco.security.SMS4;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Servlet implementation class Query
 */
public class Query extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Query() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String flag = request.getParameter("c").substring(0, 2);
        String idmiwen = request.getParameter("c").substring(2);
        String idmingwen = null;
        try {

            if (flag.equals("00")) {
                idmingwen = DES.getInstance().de(idmiwen);
            } else if (flag.equals("01")) {
                idmingwen = DESede.getInstance().de(idmiwen);
            } else {
                idmingwen = new SMS4().de(idmiwen);
            }

        } catch (Exception e) {
            ArrayList<Record> list = null;
            request.setAttribute("list", list);
            if (request.getRequestURL().toString().contains("qa")) {
                request.getRequestDispatcher("qa.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("identify.jsp").forward(request, response);
            }
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
            request.setAttribute("list", list);
            if (request.getRequestURL().toString().contains("qa")) {
                request.getRequestDispatcher("qa.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("identify.jsp").forward(request, response);
            }
            if (list.size() != 0) {
                tx = session.beginTransaction();
                long num = list.get(0).getNum() + 1;
                Record r = (Record) session.get(Record.class, list.get(0).getId());
                r.setNum(num);
                tx.commit();
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

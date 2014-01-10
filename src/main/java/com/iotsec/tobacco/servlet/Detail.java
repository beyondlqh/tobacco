package com.iotsec.tobacco.servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iotsec.tobacco.qrcode.QRCode;
import com.iotsec.tobacco.security.DES;
import com.iotsec.tobacco.security.DESede;
import com.iotsec.tobacco.security.SMS4;

/**
 * Servlet implementation class Detail
 */
public class Detail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Detail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String miwenPID;
		if(request.getParameter("flag").equals("00")){
			 miwenPID= DES.getInstance().en(request.getParameter("id"));}
		else if (request.getParameter("flag").equals("01")){
			miwenPID= DESede.getInstance().en(request.getParameter("id"));
		}else{
			miwenPID= new SMS4().en(request.getParameter("id"));
		}
		String plain= "http://61.160.98.53:5033"+ "/q?c="+ (request.getParameter("flag"))+ miwenPID;
		QRCode.create(plain,request.getSession().getServletContext().getRealPath("")+ File.separator + miwenPID+".gif");
		request.setAttribute("PID", miwenPID);
		request.getRequestDispatcher("detail.jsp").forward(request, response);
		
	}

}

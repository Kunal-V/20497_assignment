package com.sonata;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AddInterface add = new AddInterfaceImpl();
		int result = add.add(1000, 2000);
		RequestDispatcher rd = request.getRequestDispatcher("demo.jsp");
		request.setAttribute("result :" , result);
		rd.forward(request, response);
		
	}

}

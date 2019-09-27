package com.hcl.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class History
 */
public class History extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public History() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LibraryDAO dao=new LibraryDAO();
		PrintWriter out = response.getWriter();
		String bookid=request.getParameter("bookId");
		String fromdate = request.getParameter("Fromdate");
		String todate = request.getParameter("Todate");	
		String username = request.getParameter("Username");
		RequestDispatcher rd1 = request.getRequestDispatcher("/UserAccount");
		rd1.include(request, response);
		out.write("<br/>History : <br/>");
		out.write("<html><head><meta http-equiv='Content-Type'" +
		" content='text/html; charset=ISO-8859-1'></head>"+
		"<body><table><tr><td>BookId</td><td>Fromdate</td><td>Todate</td></tr>");
		out.write("<td>"+bookid+"</td><td>"+fromdate+"</td><td>"+todate+"</td></tr>");	
		out.println(dao.history(username));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

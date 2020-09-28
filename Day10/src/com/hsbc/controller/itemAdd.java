package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class itemAdd
 */
@WebServlet("/itemAdd")
public class itemAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public itemAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String itemname = request.getParameter("itemName");
		List<String> list = new ArrayList<String>();
		if((List<String>) session.getAttribute("itemlist")==null) {
			List<String> list1 = new ArrayList<String>();
			list1.add(itemname);
			list = list1;
		}
		else {
			List listx = (List) session.getAttribute("itemlist");
			list = listx;
			list.add(itemname);
			
		}
		session.setAttribute("itemlist", list);
		PrintWriter pw = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("item.html");
		rd.include(request, response);
		pw.print("<html><body><p>");
		pw.print("Current list size is : " + list.size());
		pw.print("</p></body></html>");
	}

}

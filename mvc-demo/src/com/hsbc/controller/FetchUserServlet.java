package com.hsbc.controller;

import java.io.IOException;
import com.hsbc.exception.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;
import com.hsbc.model.service.UserService;
import com.hsbc.model.util.UserFactory;

/**
 * Servlet implementation class FetchUserServlet
 */
@WebServlet("/FetchUserServlet")
public class FetchUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchUserServlet() {
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
		String userName=request.getParameter("un");
		int id=Integer.parseInt(userName);
		UserService service=(UserService)UserFactory.getInstance("service");
		try {
			User user=service.getUser(id);
			HttpSession session = request.getSession();
			session.setAttribute("userKey", user);
			RequestDispatcher rd = request.getRequestDispatcher("fetchUser.html");
			rd.forward(request, response);
		}catch (UserNotFoundException e) {	
			RequestDispatcher rd = request.getRequestDispatcher("notFound.jsp");
			request.setAttribute("err", e.getMessage());
			rd.forward(request, response);
		}
	}

}

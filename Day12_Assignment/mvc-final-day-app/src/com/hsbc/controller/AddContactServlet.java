package com.hsbc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.model.beans.User;
import com.hsbc.model.beans.UserContact;
import com.hsbc.model.service.UserService;
import com.hsbc.model.util.UserFactory;

/**
 * Servlet implementation class AddContactServlet
 */
@WebServlet("/AddContactServlet")
public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContactServlet() {
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
		String contactName = request.getParameter("nm");
		String phone = request.getParameter("ph");
		int ph = Integer.parseInt(phone);
		UserService service = (UserService)UserFactory.getInstance("service");
		UserContact user = new UserContact();
		HttpSession session = request.getSession();
		User person = (User) session.getAttribute("userKey");
		int person_ref_id = person.getUser_Id();
		user.setContactName(contactName);
		user.setContactPhone(ph);
		user.setUser_ref(person_ref_id);
		UserContact newUser=service.createUserContact(user);
		RequestDispatcher rd = request.getRequestDispatcher("contactcreatedsuccess.jsp");
		rd.forward(request, response);
	}

}

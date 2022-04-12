package com.in28minutes.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.todo.TodoService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	private LoginService userValidationService = new LoginService();
	private TodoService todoService  = new TodoService();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}
		
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

	// Local variables
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	
	boolean isUserValid = userValidationService.isUservalid(name, password);
	
	// If user is valid, send to welcome page.
	if(isUserValid) {
		// This attribute "name" will not pass to todo.do
		// Redirecting to new page will reset all parameters 
		request.setAttribute("name", name);
		
		// request.getSession retains attributes across different requests
		// A session starts at login and ends at logout or session timeout
		request.getSession().setAttribute("name", name);
		
		// Redirect to todo.do
		response.sendRedirect("/todo.do");
	} 
	// If invalid user, send back to login page
	else {
		String errorMsg = "Your name or password is incorrect. Please Try Again";
		request.setAttribute("invalid", errorMsg);
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	}
}

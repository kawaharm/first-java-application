package com.in28minutes.todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.todo.TodoService;

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {
	
	private TodoService todoService  = new TodoService();
	
	// GET Request
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// 1. Create new Todo obj using parameter that matches list to be deleted from todo.do
		// 2. Pass new obj to deleteTodo
		// ** Typically we use ID to delete, not todo.name
		todoService.deleteTodo(new Todo(request.getParameter("todo")));
		
		// Redirect request to todo.do
		response.sendRedirect("/todo.do");
	}
	
}

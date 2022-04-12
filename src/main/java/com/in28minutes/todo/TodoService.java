package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	
	// <Todo> is called a generic
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Learn Web Application Development"));
		todos.add(new Todo("Learn Spring MVC"));
		todos.add(new Todo("Learn Spring Rest Services"));
	}

	
	public List<Todo> retrieveTodos() {
		return todos;
	}
	
	// Add new todos to List
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	
	// Delete todo
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}
}

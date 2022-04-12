package com.in28minutes.todo;

import java.util.Objects;

public class Todo {
	
	private String name;

	public Todo(String name) {
		super();
		this.name = name;
	}

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Todo [name=%s]", name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	// For delete function
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(name, other.name);
	}

	
}

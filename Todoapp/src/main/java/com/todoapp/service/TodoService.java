package com.todoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoapp.model.Todo;
import com.todoapp.model.TopForm;
import com.todoapp.repository.TodoRepository;


@Service
public class TodoService implements ITodoService{

@Autowired
TodoRepository todoRepository;

@Override
	public List<Todo> findAllTodo(){
		List<Todo> allTodo;
		allTodo = todoRepository.findAll();
		return allTodo;
	}
//	public String create() {
//		Todo todo = new Todo();
//		todo.setTitle("");
//		todoRepository.save(todo);
//		return "success";
//	}
	public String create(TopForm form) {
		Todo todo = new Todo();
		todo.setTitle(form.getTitle());
		todoRepository.save(todo);
		return "success";
}
}
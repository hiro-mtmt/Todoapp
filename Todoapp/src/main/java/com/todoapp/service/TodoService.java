package com.todoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoapp.model.DeleteForm;
import com.todoapp.model.EditForm;
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

	@Override
	public String create(TopForm form) {
		Todo todo = new Todo();
		todo.setTitle(form.getTitle());
		todoRepository.save(todo);
		return "success";
	}
	
	@Override
	public String delete(DeleteForm form) {
		Todo todo = new Todo();
		todo.setId(form.getId());
		todoRepository.delete(todo);
		return "success";
	}
}
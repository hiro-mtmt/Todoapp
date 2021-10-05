package com.todoapp.service;

import java.util.List;

import com.todoapp.model.DeleteForm;
import com.todoapp.model.EditForm;
import com.todoapp.model.Todo;
import com.todoapp.model.TopForm;

public interface ITodoService {
	List<Todo> findAllTodo();
	
	String create(TopForm form);
	
	String delete(DeleteForm form);
	
	Todo selectById(EditForm form);
	
	String regist(EditForm form);
}
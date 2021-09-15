package com.todoapp.service;

import java.util.List;

import com.todoapp.model.Todo;

public interface ITodoService {
List<Todo> findAllTodo();
}
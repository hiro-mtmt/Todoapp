package com.todoapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.todoapp.model.DeleteForm;
import com.todoapp.model.EditForm;
import com.todoapp.model.Todo;
import com.todoapp.model.TopForm;
import com.todoapp.service.TodoService;

@Controller
public class TopController {
	@Autowired
	private TodoService todoService;
	
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public String top(Model model) {
		List<Todo> todoList = todoService.findAllTodo();
		model.addAttribute("todoList", todoList);
		return "top2";
	}
	
	
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	String create(@Validated TopForm form,BindingResult result,Model model) {
		if (result.hasErrors()) {
			return "redirect:/";
        }
        todoService.create(form);
        return "redirect:/";
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	String delete(DeleteForm form,Model model) {
		todoService.delete(form);	
        return "redirect:/";
    }
}

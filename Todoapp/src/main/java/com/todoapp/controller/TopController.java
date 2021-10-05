package com.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	String top(Model model) {
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
	
	@RequestMapping(value = "/edit",method=RequestMethod.POST)
	String edit(EditForm form,Model model) {
		Todo todo = todoService.selectById(form);
		model.addAttribute("todo", todo);
		return "edit";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	String delete(DeleteForm form,Model model) {
		todoService.delete(form);	
        return "redirect:/";
    }
	
	@RequestMapping(value = "edit", params = "back")
	    String back() {
	        return "redirect:/";
	    }
	
	@RequestMapping(value = "edit", params = "regist")
	String regist(@Validated EditForm form,BindingResult result,Model model) {
		if (result.hasErrors()) {
			return "redirect:/";
        }
        todoService.regist(form);
        return "redirect:/";
	}
}

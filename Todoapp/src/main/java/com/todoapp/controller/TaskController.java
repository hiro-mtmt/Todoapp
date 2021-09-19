//package com.todoapp.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.todoapp.model.TaskForm;
//
//@Controller
//@RequestMapping("/")
//public class TaskController{
//	
//	private final TaskService taskService;
//	
//	@Autowired
//	public TaskController(TaskService taskService) {
//		this.taskService = taskService;
//	}
//	@GetMapping
//	public String task(TaskForm taskForm,Model model) {
//		
//		taskForm.setNewTask(true);
//		
//		List<Task> list = taskService.findAll();
//		
//		model.addAttribute("list","");
//		model.addAttribute("title","task");
//		
//		return "top";
//	}
//	
//	@PostMapping("/insert")
//	public String insert(@Valid @ModelAttrivute TaskForm taskForm,BindingResult result,
//			Model model) {
//			Task task = new Task();
//			task.setId(Long id);
//			task.setTitle(taskForm.getTitle)
//		
//	}
//}
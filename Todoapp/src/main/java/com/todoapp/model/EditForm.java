package com.todoapp.model;

import com.sun.istack.NotNull;

public class EditForm {
	@NotNull
	private Long id;
	
	@NotNull
    private String title;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}

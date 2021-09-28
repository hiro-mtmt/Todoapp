package com.todoapp.model;

import com.sun.istack.NotNull;

public class EditForm {
	@NotNull
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

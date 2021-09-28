package com.todoapp.model;

import com.sun.istack.NotNull;

public class DeleteForm {
	@NotNull
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

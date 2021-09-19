package com.todoapp.model;

import java.time.LocalDateTime;

import com.sun.istack.NotNull;



public class TopForm {
	
	@NotNull
	private Long id;
	
	@NotNull
    private String title;
	
	@NotNull
    private LocalDateTime createDate;
	
	@NotNull
    private int complete;
    
    public TopForm() {
   	}

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

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public int getComplete() {
		return complete;
	}

	public void setComplete(int complete) {
		this.complete = complete;
	}
}



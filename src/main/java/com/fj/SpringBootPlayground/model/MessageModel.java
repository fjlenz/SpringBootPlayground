package com.fj.SpringBootPlayground.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageModel   {

	@JsonProperty(value = "id", required = true)
	private Integer id;

	@JsonProperty(value = "message", required = true)
	private String message = null;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

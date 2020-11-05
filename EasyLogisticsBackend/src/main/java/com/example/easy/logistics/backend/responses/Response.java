package com.example.easy.logistics.backend.responses;

import java.util.List;

public class Response<T> {
	
	private T data;
	private List<String> errors;
	
	public Response(T data) {
		this.data = data;
	}
	
	public Response(List<String> errors) {
		this.errors = errors;
	}
	
	// Getters
	public T getData() {
		return data;
	}
	
	public List<String> getErrors() {
		return errors;
	}
	
	// Setters
	public void setData(T data) {
		this.data = data;
	}


	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
	
}

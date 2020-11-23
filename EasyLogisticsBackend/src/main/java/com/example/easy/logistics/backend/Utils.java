package com.example.easy.logistics.backend;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utils {
	public <T> String convertAndIndentToJsonString(T data) throws JsonProcessingException {
		
		// Creating the ObjectMapper object
		ObjectMapper mapper = new ObjectMapper();
		// Converting the Object to JSONString
		String jsonString = mapper.writeValueAsString(data);
		String newString = jsonString.replaceAll("\\\\", " ");
		return newString;
	}
}

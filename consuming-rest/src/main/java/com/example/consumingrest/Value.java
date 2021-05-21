package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
 * Value class holding quote, and respective id
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

	private Long id;
	private String quote;
	
	public Value() {
		
	}
	
	public long getId() {
		return this.id;
	}
	
	public String getQuote() {
		return this.quote;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setQuote(String quote) {
		this.quote = quote;
	}
	
	@Override
	public String toString() {
		return "Value{id=" + id + ", quote='" + quote + "'}";
	}
}

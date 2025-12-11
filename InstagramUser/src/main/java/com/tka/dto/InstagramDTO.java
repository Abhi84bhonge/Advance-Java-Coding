package com.tka.dto;

import lombok.Data;

@Data
public class InstagramDTO {

	
	
	private int id;
	private String name;
	private String email;
	private String username;
	
	
	public InstagramDTO(int id, String name, String email, String username) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
	}
	
	
	
}

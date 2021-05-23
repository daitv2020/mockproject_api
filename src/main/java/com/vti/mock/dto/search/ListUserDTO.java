package com.vti.mock.dto.search;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ListUserDTO {

	private int id;

	private String name;

	private String email;

	private String facebookId;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime loginDate;

	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}


	public LocalDateTime getLoginDate() {
		return loginDate;
	}
	
	public void setLoginDate(LocalDateTime loginDate) {
		this.loginDate = loginDate;
	}
	
	public ListUserDTO(int id, String name, String email, String facebookId) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.facebookId = facebookId;
		
	}

	public ListUserDTO(int id, String name, String email, String facebookId, LocalDateTime loginDate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.facebookId = facebookId;
		this.loginDate = loginDate;
	}
	
	public ListUserDTO() {
	}
}

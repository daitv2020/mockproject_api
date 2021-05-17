package com.vti.mock.dto.create;

public class UserDTOFormCreate {
	

	private String name;

	private String email;

	private String facebookId;
	
	
	
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

	public UserDTOFormCreate(String name, String email, String facebookId) {
		super();
		this.name = name;
		this.email = email;
		this.facebookId = facebookId;
	}

	public UserDTOFormCreate() {
		super();
	}




}

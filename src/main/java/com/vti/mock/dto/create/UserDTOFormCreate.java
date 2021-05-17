package com.vti.mock.dto.create;

public class UserDTOFormCreate {
	
	private int id;

	private String name;

	private String email;

	private String facebookId;
	
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

	public UserDTOFormCreate(int id ,String name, String email, String facebookId) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.facebookId = facebookId;
	}

	public UserDTOFormCreate() {
		super();
	}

}

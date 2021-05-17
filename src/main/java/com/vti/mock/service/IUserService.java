package com.vti.mock.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vti.mock.entity.User;

public interface IUserService {

	public User getUserByName(String name);
	
	public Page<User> getAllUsers(Pageable pageable, String search);
	
	public void createUser(User user);

	public void deleteUser(int id);
}

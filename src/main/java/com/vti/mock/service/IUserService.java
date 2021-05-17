package com.vti.mock.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vti.mock.entity.User;

public interface IUserService {

	public User getUserByName(String name);
	
	public Page<User> getAllUsers(Pageable pageable, String search);
	
	public User getUserById(int id);

	public void createUser(User user);

	public void updateUser(User user);
	
	public void deleteUser(int id);
}

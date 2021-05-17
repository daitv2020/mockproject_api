package com.vti.mock.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.mock.entity.User;
import com.vti.mock.repository.IUserRepository;

@Service
@Transactional
public class UserService implements IUserService{

	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public User getUserByName(String name) {
		return userRepository.findByName(name);
	}

}

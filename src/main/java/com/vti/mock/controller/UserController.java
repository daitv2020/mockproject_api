package com.vti.mock.controller;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vti.mock.dto.create.UserDTOFormCreate;
import com.vti.mock.entity.User;
import com.vti.mock.service.IUserService;


@RestController
@RequestMapping(value = "api/v1/users")
public class UserController {

	@Autowired
	private IUserService userService;

	/*
	 * get list user by filter, search with character
	 */
	@GetMapping()
	public Page<UserDTOFormCreate> getAllUsers(Pageable pageable,
			@RequestParam(name = "search", required = false) String search) {

		Page<User> users = userService.getAllUsers(pageable, search);

		Page<UserDTOFormCreate> usersDto = users.map(new Function<User, UserDTOFormCreate>() {

			@Override
			public UserDTOFormCreate apply(User entity) {
				UserDTOFormCreate dto = new UserDTOFormCreate(entity.getId() ,entity.getName(), entity.getEmail(),
						entity.getFacebookId());
				return dto;
			}
		});
		return usersDto;
	}

	/*
	 * get info user by name
	 */
	@GetMapping(value = "name/{name}")
	public UserDTOFormCreate getUserByName(@PathVariable(name = "name") String name) {
		User user = userService.getUserByName(name);
		if (user == null) {
			return null;
		}

		UserDTOFormCreate userDto = new UserDTOFormCreate(user.getId() ,user.getName(), user.getEmail(), user.getFacebookId());
		return userDto;
	}

	/*
	 * create user login by fb
	 */
	@PostMapping()
	public void createUser(@RequestBody UserDTOFormCreate userDto) {
		User user = new User();
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setFacebookId(userDto.getFacebookId());

		userService.createUser(user);
	}

	/*
	 * delete 1 user
	 */
	@DeleteMapping(value = "/{id}")
	public void deleteUser(@PathVariable(name = "id") int id) {
		userService.deleteUser(id);
	}

}

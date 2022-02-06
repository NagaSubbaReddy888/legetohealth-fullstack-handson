package com.legatohealth.springbootapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legatohealth.springbootapp.beans.CustomMessage;
import com.legatohealth.springbootapp.beans.User;
import com.legatohealth.springbootapp.exception.UserNotFoundException;
import com.legatohealth.springbootapp.service.UserService;

@RestController
@RequestMapping("api")
public class UserRest {

	@Autowired
	private UserService service;
	 
	@PostMapping(path = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveUser(@RequestBody User user) {
		ResponseEntity<Object> response = null;
		User createdUser = service.store(user); 
		response = ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
		return response;
	}
	
	@GetMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getUsers() {
		ResponseEntity<Object> response = null;
		List<User> list = service.fetchAllUsers();
		response = ResponseEntity.status(HttpStatus.OK).body(list);
		return response;
	}
	
	@DeleteMapping(path = "/user/{userId}")
	public ResponseEntity<Object> deleteUser(@PathVariable("userId") int id) {
		ResponseEntity<Object> response = null;
		try {
			service.deleteUser(id);
			CustomMessage custom = new CustomMessage("User with an id "+id+" deleted", 200);
			response = ResponseEntity.status(HttpStatus.OK).body(custom);
		} catch (UserNotFoundException e) {
			CustomMessage custom = new CustomMessage(e.getMessage(), 404);
			response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(custom);
		}
		return response;
	}
}
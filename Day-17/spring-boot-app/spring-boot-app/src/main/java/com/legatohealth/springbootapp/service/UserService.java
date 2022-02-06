package com.legatohealth.springbootapp.service;

import java.util.List;

import com.legatohealth.springbootapp.beans.User;
import com.legatohealth.springbootapp.exception.UserNotFoundException;

public interface UserService {
	public User store(User user); 
	public User fetchUser(int id) throws UserNotFoundException; 
	public void deleteUser(int id) throws UserNotFoundException;
	public User updatePassword(int id, String password) throws UserNotFoundException;
	public List<User> fetchAllUsers();
}

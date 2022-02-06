package com.legatohealth.springbootapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.legatohealth.springbootapp.beans.User;
import com.legatohealth.springbootapp.dao.UserDao;
import com.legatohealth.springbootapp.exception.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao; 

	@Override
	@Transactional 
	public User store(User user) {
		User userCreated = dao.save(user);
		return userCreated;
	}

	@Override
	public User fetchUser(int id) throws UserNotFoundException {
		User user = null;
		Optional<User> optional = dao.findById(id);
		if(optional.isPresent()) {
			user = optional.get(); 
		} else {
			throw new UserNotFoundException("User with an id "+id+" not found");
		}
		return user;
	}

	@Override
	@Transactional
	public void deleteUser(int id) throws UserNotFoundException {
		User user = fetchUser(id);
		dao.delete(user);
	}

	@Override
	@Transactional
	public User updatePassword(int id, String password) throws UserNotFoundException {
		User user = fetchUser(id); 
		user.setPassword(password);
		return dao.save(user);  
	}

	@Override
	public List<User> fetchAllUsers() {
		List<User> users = dao.findAll();
		return users;
	}
}
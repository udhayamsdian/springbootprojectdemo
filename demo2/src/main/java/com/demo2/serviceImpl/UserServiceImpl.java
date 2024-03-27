package com.demo2.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo2.entity.User;
import com.demo2.repository.UserRepository;
import com.demo2.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	public User createUser(User u) {
		
		return userRepo.save(u);
	}
	
	

}

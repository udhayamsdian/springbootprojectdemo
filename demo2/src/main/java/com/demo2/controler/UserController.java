package com.demo2.controler;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo2.entity.User;
import com.demo2.repository.UserRepository;
import com.demo2.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	UserService userService;
	

	
	@PostMapping("/add")
	public ResponseEntity<?> addUser(@RequestBody User user) {
//		User u = userRepo.save(user);
		
		User u= userService.createUser(user);
		return ResponseEntity.status(HttpStatus.OK)
				.body(u);
	}
	
	@GetMapping("/getAll")
	public List<User> getAllUser() {
		
		List<User> user = userRepo.findAll();
		return user;
	}
	
	
	
	
//	@GetMapping("/getUser/{id}")
//	
//	public User getUserById(@PathVariable int id)
//	{
//		
//		return userRepo.findById(id).get();
//		
//	}
	
	
	@PostMapping("/update/{id}")
	
	public String updateUser(@RequestBody User user , @PathVariable int id)
	{
		
		User u = userRepo.findById(id).get();
		u.setEmail(user.getEmail());
		u.setAge(user.getAge());
		userRepo.save(u);
		return "update Successfully";
		
		
	}
	
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id)
	{
		userRepo.deleteById(id);
		return "Delete Successfullyy";
	}
	
	
	@GetMapping("/delete1/{id}")
	public ResponseEntity<?> delete(@PathVariable int id)
	{
		userRepo.deleteById(id);
		
		return ResponseEntity.status(HttpStatus.OK)
				.body("delete successfully");
	}
	
@GetMapping("/getUser/{userName}/{age}")
	
	public ResponseEntity<?> getUserByName(@PathVariable String userName ,@PathVariable String age)
	{
		
		List<User> u = userRepo.getUserByName(userName,age);
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(u);
		
	}

}

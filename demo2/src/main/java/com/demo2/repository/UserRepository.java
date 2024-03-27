package com.demo2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo2.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{
	
	@Query("select u from User u where u.userName=?1 and u.age=?2") // JPA QUERY
	List<User> getUserByName(String userName,String age);
	

}

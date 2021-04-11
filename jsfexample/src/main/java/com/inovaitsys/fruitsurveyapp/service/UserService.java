package com.inovaitsys.fruitsurveyapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.inovaitsys.fruitsurveyapp.model.User;
import com.inovaitsys.fruitsurveyapp.repository.UserRepository;


@Service(value = "userService")
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public String saveuser() {
		User user=new User();
		user.setUsername("Nilar");
		user.setPassword(passwordEncoder.encode("123456"));
		userRepository.save(user);
		
		return "success";
	}
	
	

}

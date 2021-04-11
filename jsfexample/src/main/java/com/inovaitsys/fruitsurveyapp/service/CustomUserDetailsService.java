package com.inovaitsys.fruitsurveyapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.inovaitsys.fruitsurveyapp.model.User;
import com.inovaitsys.fruitsurveyapp.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUsername(username);
		UserDetailsImp userDetails=null;
		
		if(user!=null) {
			userDetails=new UserDetailsImp();
			userDetails.setUser(user);
		}else {
			throw new UsernameNotFoundException("user not exist with name"+username);
		}
		
		return userDetails;
		
		
		 
	}
	
	

}

package com.velocity.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.User;
import com.velocity.repository.UserRepository;
import com.velocity.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User updateUser(User user) {
		Integer id=user.getId();
		User user2=userRepository.findById(id).get();
		user2.setUsername(user.getUsername());
		user2.setPassword(user.getPassword());
		user2.setRealName(user.getRealName());
		user2.setGender(user.getGender());
		user2.setUserType(user.getUserType());
		user2.setBirthday(user.getBirthday());
		user2.setOrderlist(user.getOrderlist());
		
		
		return userRepository.save(user2);
	}

}

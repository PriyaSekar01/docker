package com.dockerProj.service;

import org.springframework.stereotype.Service;

import com.dockerProj.dto.UserDto;
import com.dockerProj.entity.User;
import com.dockerProj.repository.UserRepositroy;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Userservice {
	
	private final UserRepositroy userRepository;

	public User create(UserDto userdto) {
		User userObj = User.builder()
				.userName(userdto.getUserName())
				.password(userdto.getPassword())
				.gender(userdto.getGender())
				.address(userdto.getAddress())
				.build();
	return userRepository.save(userObj);
	}
	

}

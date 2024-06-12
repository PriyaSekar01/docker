package com.dockerProj.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dockerProj.dto.UserDto;
import com.dockerProj.entity.User;
import com.dockerProj.service.Userservice;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {
	
	private final Userservice userService;
	
	@PostMapping("/create")
	public User createUser(@RequestBody UserDto userDto) {
		return userService.create(userDto);
	}
	
	

}

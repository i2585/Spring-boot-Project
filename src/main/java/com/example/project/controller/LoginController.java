package com.example.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Service.LoginService;
import com.example.project.model.User;

@RestController
public class LoginController {

	private LoginService loginService;

	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}

	@PostMapping("/user/login")
	public boolean loginUser(@RequestBody User user) {
		return loginService.loginUser(user);
	}
}

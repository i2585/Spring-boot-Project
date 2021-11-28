package com.example.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Service.JoinService;
import com.example.project.model.User;

@RestController
public class JoinController {

	private JoinService joinService;

	public JoinController(JoinService joinService) {
		this.joinService = joinService;
	}

	@PostMapping("/user/join")
	public boolean insertUserProfile(@RequestBody User user) {
			return joinService.insertUserProfile(user);
	}
}

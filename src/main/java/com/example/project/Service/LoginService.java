package com.example.project.Service;

import org.springframework.stereotype.Service;

import com.example.project.mapper.Usermapper;
import com.example.project.model.User;

@Service
public class LoginService {
	private Usermapper mapper;

	public LoginService(Usermapper mapper) {
		this.mapper = mapper;
	}

	public boolean loginUser(User user) {
		return mapper.loginUser(user) != null ? true : false;
	}
}

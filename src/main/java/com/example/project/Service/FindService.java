package com.example.project.Service;

import org.springframework.stereotype.Service;

import com.example.project.mapper.Usermapper;
import com.example.project.model.User;

@Service
public class FindService {
	private Usermapper mapper;

	public FindService(Usermapper mapper) {
		this.mapper = mapper;
	}

	public String findUserId(User user) {
		String id = mapper.findId(user);
		if (id != null) {
			user.setId(id);
			return user.getId();
		} else {
			return "false";
		}
	}

	public void findUserPw(User user) {
		mapper.findPw(user);
	}
}

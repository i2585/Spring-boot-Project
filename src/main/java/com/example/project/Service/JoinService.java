package com.example.project.Service;

import org.springframework.stereotype.Service;

import com.example.project.mapper.Usermapper;
import com.example.project.model.User;

@Service
public class JoinService {
	private Usermapper mapper;

	public JoinService(Usermapper mapper) {
		this.mapper = mapper;
	}

	public boolean insertUserProfile(User user) {
		if(mapper.checkId(user) == null) {
			mapper.insertUser(user);
			return true;
		}
		else {
			return false;	
		}
	}
}

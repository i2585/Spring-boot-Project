package com.example.project.Service;

import org.springframework.stereotype.Service;

import com.example.project.mapper.Usermapper;
import com.example.project.model.User;

@Service
public class EditUserService {
	private Usermapper mapper;
	
	public EditUserService(Usermapper mapper) {
		this.mapper = mapper;
	}
	
	// 회원정보 수정
	public boolean edit(User user) {
		if(user.getName() != "" || user.getPhonenumber() != "") {
			mapper.editUser(user);
			return true;
		}
		else {
			return false;
		}
	}
}

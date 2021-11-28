package com.example.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Service.EditUserService;
import com.example.project.model.User;

@RestController
@RequestMapping("/edit")
public class EditUserController {

	private EditUserService editUserService;
	
	public EditUserController(EditUserService edituserservice) {
		this.editUserService = edituserservice;
	}
	
	// ȸ������ ����
	@PostMapping("/userprofile")
	public boolean edit(@RequestBody User user) {
		return editUserService.edit(user);
	}
	
//	// ��й�ȣ ����
//	@PostMapping("/pw")
//	public boolean editPw(@RequestBody User user){
//		if(user.getPw() != "") {
//			mapper.editPw(user);
//			return true;
//		}
//		else {
//			return false;
//		}
//		
//	}
	
//	
//	// �ּ� ����
//	@PostMapping("/address")
//	public boolean editAddress(@RequestBody User user) {
//		if(user.getAddress() != "") {
//			mapper.editAddress(user);
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	// �̸��� ����
//	@PostMapping("/email")
//	public boolean editEmail(@RequestBody User user) {
//		if(user.getEmail() != "") {
//			mapper.editEmail(user);
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	// ����ȣ ����
//	@PostMapping("/name")
//	public boolean editPhonenumber(@RequestBody User user) {
//		if(user.getEmail() != "") {
//			mapper.editPhonenumber(user);
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
}

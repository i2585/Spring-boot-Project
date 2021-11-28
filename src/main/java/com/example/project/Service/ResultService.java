package com.example.project.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.project.mapper.Specmapper;
import com.example.project.mapper.Usermapper;
import com.example.project.model.Spec;
import com.example.project.model.User;

@Service
public class ResultService {
	private Specmapper SpecMapper;
	private Usermapper UserMapper;

	public ResultService(Specmapper SpecMapper, Usermapper UserMapper) {
		this.SpecMapper = SpecMapper;
		this.UserMapper = UserMapper;
	}

	 public Map<String, Object> values(Map<String, String> param, Spec spec, User user) {
		Map<String, Object> map = new HashMap<>();
		spec.setName(param.get("name"));
		spec.setWidth(Double.parseDouble(param.get("width")));
		user.setId(param.get("id"));
		Integer cost = SpecMapper.getCost(spec);
		User result = UserMapper.searchUser(user);
		map.put("name", spec.getName());
		map.put("cost", cost);
		map.put("Username", result.getName());
		map.put("phonenumber", result.getPhonenumber());
		return map;
	}
}

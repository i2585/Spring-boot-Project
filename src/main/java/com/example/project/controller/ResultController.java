package com.example.project.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Service.ResultService;
import com.example.project.model.Spec;
import com.example.project.model.User;

@RestController
public class ResultController {
	private ResultService resultService;

	public ResultController(ResultService resultService) {
		this.resultService = resultService;
	}

	@PostMapping("/cost")
	 public Map<String, Object> values(@RequestBody Map<String, String> param, Spec spec, User user) {
		return resultService.values(param, spec, user);
	}
}
package com.kukim.submodules.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationProfileController {

	@Value("${github.submodules.name}")
	private String applicationProfileName;

	@GetMapping("/name")
	public String showName() {
		return applicationProfileName;
	}
}

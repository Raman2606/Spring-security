package com.example.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleController {

	
	@GetMapping("hello-world")
	public String hello() {
		return "hello there !";
	}
	@GetMapping("admin")
	public String helloAdmin() {
		return "hello Admin !";
	}
	
	@GetMapping("user")
	public String helloUser() {
		return "hello User !";
	}
}

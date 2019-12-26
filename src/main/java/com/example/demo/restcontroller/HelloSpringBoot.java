package com.example.demo.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {

	@RequestMapping("/")
	public String welcome() {
		return "Hello from Spring Boot! 4";
	}
	
}

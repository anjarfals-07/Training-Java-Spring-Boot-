package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @GetMapping("/hello")
	// public String hello(@RequestParam(value = "name", defaultValue = "World")
	// String name) {
	// return String.format("Hello %s!", name);
	// }
	// @PostMapping("/hello")
	// public String hello(@RequestParam(value = "name", defaultValue = "Java
	// Spring") String name) {
	// return String.format("Hello %s!", name);
	// }
	@PostMapping("/hello")
	public String hello() {
		return String.format("Hello Java Spring Boot");
	}
}
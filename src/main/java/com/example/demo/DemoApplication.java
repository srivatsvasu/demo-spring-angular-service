package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DemoApplication {

	@GetMapping("/work")
	public List<String> getValue(){

	return Arrays.asList("abc","def","steve","brook");

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ArahansaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArahansaApplication.class, args);
	}

	@RestController
	static class DefaultController{
		@GetMapping("/")
		public String index(){
			return "hello world";
		}
	}
}

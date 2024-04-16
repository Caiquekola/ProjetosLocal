package com.web.aprendendo.SpringWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWebApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringWebApplication.class, args);

	}

	@GetMapping("/")
	public String index(){
		return "Olá mundo!";
	}
}

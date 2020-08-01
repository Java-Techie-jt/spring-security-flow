package com.javatechie.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
@RequestMapping("/secure/rest")
public class SpringSecurityBasicAuthenticationApplication {

	 @GetMapping
	public String welcome(Principal principal){
		return "Hi "+principal.getName()+" welcome to my application !";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasicAuthenticationApplication.class, args);
	}

}

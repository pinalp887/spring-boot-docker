package com.pinal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class HelloResource {

	@GetMapping
	private String test() {
		return "THIS IS THE DEMO OF THE DOCKER FIRST TIME with override images";
	}
}

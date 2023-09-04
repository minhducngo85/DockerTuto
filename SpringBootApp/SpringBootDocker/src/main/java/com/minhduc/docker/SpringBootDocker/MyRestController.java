package com.minhduc.docker.SpringBootDocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@GetMapping("/messages")
	public String getMessage() {
		return "Hello from Docker!";
	}
}

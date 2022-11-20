package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")

public class MessageController {
	
	@GetMapping("/msg")
	public String getMessage() {
		System.out.println("request executeed...");
		String message="message from getmessage method ";
		return message;
	}

}

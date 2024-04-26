package com.example.firstservice;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
@AllArgsConstructor
public class Controller {

	private Sender service;

	@PostMapping("/send")
	public void send(@RequestParam String message) {
		service.sendMessage(message);
	}

}

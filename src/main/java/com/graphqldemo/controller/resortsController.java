package com.graphqldemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class resortsController {

	@GetMapping("/ping")
	public String ping() {
		return "ping successful";
	}
}

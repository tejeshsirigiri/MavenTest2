package com.example.sample2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("getData")
public String getaData() {
	return "this is from backend  hi i am tejesh what can i do for u ";
}
}

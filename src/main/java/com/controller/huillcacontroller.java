package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/richeti")

public class huillcacontroller {
	
	@GetMapping
	public String get(){
		return "ya aprobe";
	}
}

package com.caso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD
@RestController
@RequestMapping("/caperusa")
public class HomeController {
@GetMapping
public String get() {
	return "HOLA InmortalDolton";
}
=======

@RestController
@RequestMapping("/caperusa")
public class HomeController {
	
	@GetMapping
	public String get() {
		return "hola mundo";
	}

>>>>>>> 34b51b6046d0ff52ac9cddeb9f5b9806ee89af88
}

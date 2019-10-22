package com.caso.gutierrez;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alejo")
public class AlejoController {

	@GetMapping
	public String get() {
		return "Hola soy Alejo";
	}
}

package com.caso.controllerRamirez;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ramirez")
public class RamirezController {
	@GetMapping("/")
	public String ramirez() {

		return "Disuelvo el congreso";
	}
}

package com.controller.nick;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/nick")
public class nickController {
	@GetMapping("/")
	public String saludar(){
		return "hola mi nombre es nick";
	}
}

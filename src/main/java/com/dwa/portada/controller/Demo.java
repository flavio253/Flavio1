package com.dwa.portada.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class Demo {
	@GetMapping("/Demo/portada")
	public String Portada()
	{
		return "portada";
	}
}

package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
public class DemoContoller {
	
	@GetMapping("/f1")
	public String f1()
	{
		
		return "My First Jenkins Pipeline !!!! ";
	}
	
	

}

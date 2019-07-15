package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MicroHelloWorld {
@RequestMapping("/MicroHelloWorld")
	public @ResponseBody String method1()
	{
	
		
		return "MC-Hello";
	}

}

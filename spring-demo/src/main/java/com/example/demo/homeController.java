package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
@GetMapping("/home")
public String getStrin()
{
	return "returned";
}
}

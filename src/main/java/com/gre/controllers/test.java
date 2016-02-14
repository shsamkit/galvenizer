package com.gre.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
	@RequestMapping(value="/helloworld")
	public String helloWorld(){
		return "Hello World";
	}
}

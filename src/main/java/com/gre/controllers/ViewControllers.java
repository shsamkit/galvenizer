package com.gre.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewControllers {
	@RequestMapping(value="/home")
	public String search(){
		return "index";
	}
}

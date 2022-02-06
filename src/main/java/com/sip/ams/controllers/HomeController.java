package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/info")
	public String info() 
	{
		return "home/info";
	}
	@RequestMapping("/affichage")
	public String affichage() 
	{
		System.out.println("methode affichage");
		return "home/affichage";
	}
}

package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/info")
	public String info(Model model) 
	{
		String formation = "Fullstack";
		
		System.out.println("methode info");
		
		ArrayList<String> names = new ArrayList<>();
		names.add("OCA");
		names.add("OCP");
		names.add("Spring");
		names.add("Angular");
		model.addAttribute("names",names);
		model.addAttribute("workshop",formation);
		return "home/info";
	}
	@RequestMapping("/affichage")
	public String affichage() 
	{
		System.out.println("methode affichage");
		return "home/affichage";
	}
}

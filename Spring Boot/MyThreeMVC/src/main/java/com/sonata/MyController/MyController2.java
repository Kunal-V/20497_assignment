package com.sonata.MyController;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController2 {
	
	
	@GetMapping("/register_form")
	public String showForm(Model model ) {
		User1 user = new User1();
		user.setUsername("Kunal");
		model.addAttribute("user" ,user);
		return "register_form";
		
	}
}

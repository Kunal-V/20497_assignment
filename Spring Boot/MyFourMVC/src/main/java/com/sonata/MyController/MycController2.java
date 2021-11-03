package com.sonata.MyController;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MycController2 {

			 @RequestMapping(value = "/today" , method = RequestMethod.GET, params = "format=view")
			    public String dateView Model model) {
			    	LocalDate Id = java.time.LocalDate.now();
			    	model.addAttribute(Id);
			    	return "date";
			    }
				
			    @RequestMapping(value = "/tomorrow")
			    public String tomorrow (Model model) {
				 return "time";

	      
	
	
	 }

}

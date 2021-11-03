package com.sonata.MyController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloworld")
public class MyController {
	
	
	@RequestMapping(value = "/sayspringcore5", method = RequestMethod.GET)
	// Return type is String
	// Receives Model type model object as argument
	public String helloWorld(Model model) {
		model.addAttribute("message4", "Spring Core! 5");

		return "mypage4";
		
	}
	
	
	@RequestMapping(value = "/sayspringcore1", method = RequestMethod.GET)
	// Return type is String
	// Receives Model type model object as argument
	public String helloWorld1(Model model) {
		model.addAttribute("message1", "Spring Core 1!");

		return "mypage1";
	}

	
	
	@RequestMapping(value = "/sayspringcore2", method = RequestMethod.GET)
	// Return type is String
	// Receives Model type model object as argument
	public String helloWorld2(Model model) {
		model.addAttribute("message2", "Spring Core! 2");

		return "mypage2";
	}
	
	
	@RequestMapping(value = "/sayspringcore3", method = RequestMethod.GET)
	// Return type is String
	// Receives Model type model object as argument
	public String helloWorld3(Model model) {
		model.addAttribute("message3", "Spring Core! 3");

		return "mypage3";
	}

	@RequestMapping(value = "/sayspringcore4", method = RequestMethod.GET)
	// Return type is String
	// Receives Model type model object as argument
	public String helloWorld4(Model model) {
		model.addAttribute("message5", "Spring Core! 4");

		return "mypage5";
	
}
	
	@RequestMapping(value = "/helloString/{helloID}", method = RequestMethod.GET, params= "myCity=Bangalore")
	public String myURLPath(@PathVariable String helloID,@RequestParam("myCity") String city, Model model)
	{
		model.addAttribute("message" +helloID , "message" + helloID + "is selected" + "I live in this city" +city);
		return "mypage" +helloID;
	}

}

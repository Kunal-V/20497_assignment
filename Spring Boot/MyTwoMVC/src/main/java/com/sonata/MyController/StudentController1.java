package com.sonata.MyController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/studentdetail")
public class StudentController1 {


	@RequestMapping(value = "detail", method = RequestMethod.GET)
	//@RequestMapping(value = "studentdetail", method = RequestMethod.GET, params = { "id=100" , "name=Kunal" , "marks=85" })
	public String getDetails(@RequestParam("id") int id , @RequestParam("name") String name, @RequestParam("marks") int marks, Model model) {
		{
			model.addAttribute("studentID", id);
			model.addAttribute("studentName", name);
			model.addAttribute("studentMarks", marks);
			
			return "studentdetail";
			
		}
	}
}

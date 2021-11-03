package com.sonata.MyController;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloworld")
public class StudentController {
	
	
	@RequestMapping(value = "/studentdetails", method = RequestMethod.GET)
	public String helloWorld(ModelMap modelmap) {
		modelmap.addAttribute("studentID", 500);
		modelmap.addAttribute("studentName", "Kunal");
		modelmap.addAttribute("studentMarks", 85);
		
		return "studentdetails";
	
	}
	
}






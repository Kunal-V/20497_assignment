package com.sonata.MyController;


import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloWorld2 {
	
	//@RequestMapping("/hello")
		@RequestMapping(method = RequestMethod.GET)
		public String sayHi() {
			return "Hello welcome to sonata";
		}
		
		@RequestMapping(value="/myView")
		public String MyMethod() {
			return "welcome to spring web";
		}

		@RequestMapping(value = "/sayspringcore", method = RequestMethod.GET)
		@ResponseBody
		public String HelloWorld(Model model) {
			model.addAttribute("message4" , "Spring Core!");
			return "mypage4";
		}

	}



	



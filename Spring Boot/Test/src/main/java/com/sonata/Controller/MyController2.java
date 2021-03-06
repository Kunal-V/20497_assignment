package com.sonata.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;



@Controller
public class MyController2 {

	
	@RequestMapping(value = "/today", method = RequestMethod.GET, params = "format=body")
	@ResponseBody
	public String dateJSON() {
	LocalDate ld = java.time.LocalDate.now();
	int day = ld.getDayOfMonth();
	Month month = ld.getMonth();
	int year = ld.getYear();
	String json = "{'year':" + year + ",'month'" + month + ",'day'" + day + "}";
	return json;
	}
	

@RequestMapping(value = "/today", method = RequestMethod.GET, params = "format=view")
public String dateView(Model model) {
LocalDate ld = java.time.LocalDate.now();
model.addAttribute("date", ld);
return "show_date";
}

@RequestMapping("/tomorrow")
public String tomorrow (Model model) {
model.addAttribute("tomorrow");
return "tomorrowa";
}

@RequestMapping(value = "/morning", method = RequestMethod.GET)
public String gmorning(Model model) {
	LocalTime ld = java.time.LocalTime.now();
	model.addAttribute("time", ld);
	model.addAttribute("morning", "Good Morning!!!!");
	return "morning";

}
}

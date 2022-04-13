package com.ak.displaydate;


import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
		public String date(Model model) {
			java.util.Date date =new java.util.Date();
			SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM, yyyy");
			String strDate= formatter.format(date);
			model.addAttribute("date", strDate);
			return "date.jsp";
		}
	
	@RequestMapping("/time")
	public String time(Model model) {
		java.util.Date date =new java.util.Date();
		String strTime= DateFormat.getTimeInstance(DateFormat.SHORT).format(date); 		 
		model.addAttribute("time", strTime);
		return "time.jsp";
	}
}

package com.proj.rup;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 */
@Controller
public class HomeController {
	

	

	
	/**
	 * 
	 * 경식아 이거뭐야?>!
	 * 
	 * 안녕 친구들
	 * 안녕?????????????
	 * 
	 * 근데 이걸 남들이 어떻게 가져오지?
	 * 
	 * 
	 * 
	 */
	

private static final Logger logger = LoggerFactory.getLogger(HomeController.class);






>>>>>>> branch 'sang' of https://github.com/fbrudtlr9870/Final_Convenience.git
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}

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


@Controller
public class HomeController {
	

	

	
	/**
	 * 			또 하루 멀어져 간다
				내뿜은 담배 연기처럼
				작기만한 내 기억 속에
				무얼 채워 살고 있는지
				점점 더 멀어져 간다
				머물러 있는 청춘인 줄 알았는데
				비어가는 내 가슴 속엔
				더 아무 것도 찾을 수 없네
				
				계절은 다시 돌아 오지만
				떠나간 내 사랑은 어디에
				내가 떠나 보낸 것도 아닌데
				내가 떠나 온 것도 아닌데
				
				조금씩 잊혀져 간다
				머물러 있는 사랑인 줄 알았는데
				또 하루 멀어져 간다
				매일 이별하며 살고 있구나
				매일 이별하며 살고 있구나
				
				점점 더 멀어져 간다
				머물러 있는 청춘인 줄 알았는데
				비어가는 내 가슴 속엔
				더 아무 것도 찾을 수 없네
				
				계절은 다시 돌아 오지만
				떠나간 내 사랑은 어디에
				내가 떠나 보낸 것도 아닌데
				내가 떠나 온 것도 아닌데
				
				조금씩 잊혀져 간다
				머물러 있는 사랑인 줄 알았는데
				또 하루 멀어져 간다
				매일 이별하며 살고 있구나
				매일 이별하며 살고 있구나
				
				곧 휴가철이다.
				우리가 떠날 때다.
				
				경식아 우리 잘 돼
				ㅁㄴㅇ
				그래....너가 대준다면..
				알았어 그래ㅑ


				잘됩니다.
				
			ㅋㅌㅊㅋㅌㅊ
			ㅋㅌㅊㅋㅌㅊ
		




			b
	 *
	 */
	

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
		
		
		
		
		/* 경식이 허락따윈 받지 않고 그냥 머쥐한다.*/
		
	}
	
}

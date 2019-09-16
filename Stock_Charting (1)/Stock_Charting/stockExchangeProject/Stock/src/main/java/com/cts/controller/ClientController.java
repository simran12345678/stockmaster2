package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/client")
public class ClientController {
	@RequestMapping("index")
	
	public ModelAndView login() {
		System.out.println("---login method--");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("welcome");
	return mv;
	}

}

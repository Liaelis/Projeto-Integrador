package com.elisrs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/sobre")
	public String sobre(){
	    return "pages/sobre";
	}
	@RequestMapping("/cadastro")
	public String cadastrouser(){
	    return "pages/cadastro";
	}
}

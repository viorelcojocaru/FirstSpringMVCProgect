package com.crossinx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnnotationController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){System.out.println("TEST.helloWorld............");
		ModelAndView model=new ModelAndView("AnnotationPage");
		model.addObject("msg", "hello From Annotation Mode");
		
		return model;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld(){System.out.println("TEST.HiWorld.............");
		ModelAndView model=new ModelAndView("home/HelloPage");
		model.addObject("message", "hello From Annotation Mode HiWorld method");
		
		return model;
	}
	
}

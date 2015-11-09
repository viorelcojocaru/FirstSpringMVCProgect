package com.crossinx.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("/help")
public class HelpController {
	
	@RequestMapping("/help/{userName}")
	public String helpWorld(ModelMap model,@PathVariable("userName" )String userName){System.out.println("TEST.helpWorld............");
		String str="YES";
		model.addAttribute("answer",str).addAttribute("answer2", "NO").addAttribute("answer3", "Let's Think"+" "+userName);
		return "help/HelpPage";
	}

	@RequestMapping("/location/{countryName}/{userName}")
	public String helpWorldToo(ModelMap model,@PathVariable Map<String,String> pathVars){System.out.println("TEST.helpWorld Too............");
		String countryName=pathVars.get("countryName");
		String userName	  =pathVars.get("userName");
		String str="YES";
		model.addAttribute("answer",str).addAttribute("answer2", "NO").addAttribute("answer3", "Let's Think"+" "+userName + ", are you from "+countryName+"?");
		return "help/HelpPage";
	}

}

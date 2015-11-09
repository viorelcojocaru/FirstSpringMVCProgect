package com.crossinx.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crossinx.student.Student;
import com.crossinx.student.StudentNameEditor;




@Controller
//@RequestMapping("/student")
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		
//		binder.setDisallowedFields(new String[] {"mobile"});//am facut acest cinp sa fie Disable ,in pagina submited nu va aparea asa cimp
		/*
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy***MM***dd");//vom schimba formatul Date
		binder.registerCustomEditor(Date.class, "DOB",new CustomDateEditor(dateFormat, false)); //aici il vom seta pentru al cunoate springul
																								//si cimpul DOB si al converti  in Date tip
		*/
//		binder.addValidators(new StudentValidator());//pentru validare trebuie de verificat
//		binder.registerCustomEditor(String.class , "name",new StudentNameEditor());
	}
	
	@RequestMapping(value="/admissionForm.html",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView modelAndView=new ModelAndView("student/AdmissionFormPage");
		return modelAndView;
	}
	
	@ModelAttribute//sa fie accesat in mai lute pagini care au acces la acest controller
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMessage","Datele studentului sa fie afisate in antet");
	}

	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student")Student student, BindingResult request){
		
		if (request.hasErrors()) {
			ModelAndView modelAndView=new ModelAndView("/student/AdmissionFormPage");
			return modelAndView;
		}
		
		ModelAndView modelAndView=new ModelAndView("student/AdmissionSuccessPage");		
		return modelAndView;
	}
	
	
}
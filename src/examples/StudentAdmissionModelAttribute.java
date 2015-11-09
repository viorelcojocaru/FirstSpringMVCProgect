package examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crossinx.student.Student;

@Controller
//@RequestMapping("/student")
public class StudentAdmissionModelAttribute {
	
	@RequestMapping(value="/admissionForm",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView modelAndView=new ModelAndView("student/AdmissionForm");
		
		return modelAndView;
	}

	@RequestMapping(value="/submitAdmissionForm",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student")Student student){
		ModelAndView modelAndView=new ModelAndView("student/AdmissionSuccess");
		/*
		 * penru a renunta definitiv la "@RequestParam" si 
		 * parametrii acestea pe parti aparte in cazul Obiectului Student
		 * putem inlocui cu Annotatia: "@ModelAttribute("student")Student student"
		 * ex : "public ModelAndView submitAdmissionForm(@ModelAttribute("student")Student student)" */
		modelAndView.addObject("subsol","Datele studentului transmis ca ModelAttribute");
		modelAndView.addObject("student",student);
		
		
		return modelAndView;
	}
}
	
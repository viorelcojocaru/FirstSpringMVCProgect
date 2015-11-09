package examples;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crossinx.student.Student;

@Controller
//@RequestMapping("/student")
public class StudentAdmissionAddingCommonObjects {
	
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
	public ModelAndView submitAdmissionForm(@ModelAttribute("student")Student student){
		ModelAndView modelAndView=new ModelAndView("student/AdmissionSuccessPage");		
		return modelAndView;
	}
}
	
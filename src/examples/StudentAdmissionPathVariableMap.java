package examples;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/student")
public class StudentAdmissionPathVariableMap {
	
	@RequestMapping(value="/admissionForm.html",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView modelAndView=new ModelAndView("student/AdmissionFormPage");
		
		return modelAndView;
	}

	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@PathVariable Map<String,String> reqPar){
		ModelAndView modelAndView=new ModelAndView("student/AdmissionSuccessPage");
		/*In loc de "@RequestParam("studentName") String studentName,@RequestParam("studentHobby") String studentHobby"
		 * putem sa folosim "@PathVariable Map<String,String> reqPar
		 * String studentName  =reqPar.get("studentName");
		 * String studentHobby =reqPar.get("studentHobby");
		*/
		String studentName  =reqPar.get("studentName");
		String studentHobby =reqPar.get("studentHobby");
		modelAndView.addObject("msg", "Detail submited by: Name: "+studentName+" have hobby: "+studentHobby);		
		
		return modelAndView;
	}
}
	
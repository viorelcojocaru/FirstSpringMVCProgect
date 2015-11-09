package examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
//@RequestMapping("/student")
public class StudentAdmissionDefaultValue {
	
	@RequestMapping(value="/admissionForm.html",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView modelAndView=new ModelAndView("student/AdmissionFormPage");
		
		return modelAndView;
	}

	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value="name", defaultValue="Mr.or Ms Name") String studentName,@RequestParam("hobby") String studentHobby){
		ModelAndView modelAndView=new ModelAndView("student/AdmissionSuccessPage");
		/*In cazul cind dorim sa trimitem o valoarea implicita(daca nu sa introdus careva datein input)
		 *  este suficient ca in loc de  parametrul "studentName"din  "@RequestParam("studentName") String studentName"
		 *  sa fie in locuit cu "value="studentName", defaultValue="Mr.or Ms Name" 
		 *  ex:  @RequestParam(value="studentName", defaultValue="Mr.or Ms Name") String studentName"
		 */		
		modelAndView.addObject("msg", "Detail submited by: Name: "+studentName+" have hobby: "+studentHobby);		
		
		return modelAndView;
	}
}
	
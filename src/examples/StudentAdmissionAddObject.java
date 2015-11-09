package examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.crossinx.student.Student;

@Controller
//@RequestMapping("/student")
public class StudentAdmissionAddObject {
	
	@RequestMapping(value="/admissionForm.html",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView modelAndView=new ModelAndView("student/AdmissionFormPage");
		
		return modelAndView;
	}

	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("name") String studentName,@RequestParam("hobby") String studentHobby){
		ModelAndView modelAndView=new ModelAndView("student/AdmissionSuccessPage");
//		aici vedem cum putem trimite un obiect in pagina prin model
		Student student=new Student();
		student.setName(studentName);
		student.setHobby(studentHobby);	
		modelAndView.addObject("student",student);

		
		return modelAndView;
	}
}
	
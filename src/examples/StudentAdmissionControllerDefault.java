package examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crossinx.student.Student;

@Controller
//@RequestMapping("/student")
public class StudentAdmissionControllerDefault {
	
	@RequestMapping(value="/admissionForm.html",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView modelAndView=new ModelAndView("student/AdmissionFormPage");
		
		return modelAndView;
	}

	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student")Student student){
		ModelAndView modelAndView=new ModelAndView("student/AdmissionSuccess.html");
		/*inplicit   
		 * public ModelAndView submitAdmissionForm(@RequestParam("studentName") String studentName,@RequestParam("studentHobby") String studentHobby)*/
		
		/*In cazul cind dorim sa trimitem o valoarea implicita(daca nu sa introdus careva datein input)
		 *  este suficient ca in loc de  parametrul "studentName"din  "@RequestParam("studentName") String studentName"
		 *  sa fie in locuit cu "value="studentName", defaultValue="Mr.or Ms Name" 
		 *  ex:  @RequestParam(value="studentName", defaultValue="Mr.or Ms Name") String studentName"
		 *  modelAndView.addObject("msg", "Detail submited by: Name: "+studentName+" have hobby: "+studentHobby);
		 */
		
		/*In loc de "@RequestParam("studentName") String studentName,@RequestParam("studentHobby") String studentHobby"
		 * putem sa folosim "@PathVariable Map<String,String> reqPar
		 * String studentName  =reqPar.get("studentName");
		 * String studentHobby =reqPar.get("studentHobby");
		 * modelAndView.addObject("msg", "Detail submited by: Name: "+studentName+" have hobby: "+studentHobby);
		*/
			
		/*
		aici vedem cum putem trimite un obiect in pagina prin model
		Student student=new Student();
		student.setStudentName(studentName);
		student.setStudentHobby(studentHobby);
		modelAndView.addObject("student",student);
		*/
		/*
		 * penru a renunta definitiv la "@RequestParam si 
		 * parametrii acestea pe parti aparte in cazul Obiectului Student
		 * putem inlocui cu Annotatia: "@ModelAttribute("student")Student student"
		 * ex : "public ModelAndView submitAdmissionForm(@ModelAttribute("student")Student student)" */
		
		modelAndView.addObject("subsol","Datele studentului transmis ca obiect");
		
		return modelAndView;
	}
}
	
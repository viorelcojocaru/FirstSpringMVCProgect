package com.crossinx.student;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator  {
	
	@Override
	public boolean supports(Class clazz) {
		return Student.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {
		ValidationUtils.rejectIfEmpty(e, "hobby", "hobby.include");
		Student student= (Student)obj;
		if (student.getHobby().length()<3) {
			e.rejectValue("Hobby", "more");
		}else if(student.getHobby().length()>30){
			e.rejectValue("Hobby", "less");
		}
	}

}

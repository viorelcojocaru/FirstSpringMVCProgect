package com.crossinx.student;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	
	/*
	 * cind se va face 	submit la forma
	 * Spring MVC va rula metoda setAsText a acestei clase
	 * inaintea accesarii proprietatii nume a obiectului Student */
	public void setAsText(String studentName) throws IllegalArgumentException{
		
		if (studentName.contains("Mr. ")||studentName.contains("Ms. ")) {
			setValue(studentName);
		}else{
			studentName="Ms. "+studentName;
			setValue(studentName);
		}
	}

}

package com.crossinx.student;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class Student {

	@NotEmpty(message = "NotEmpty.student.name")
	private String name;

	// @NotNull(message = "{NotEmpty.student.hobby}")
	@Size(min = 6, max = 30, message = "Size.student.hobby")
	private String hobby;

	@Phone(message = "Phone.student.phone")
	private String mobile;
	@Past
	private Date DOB;

	private ArrayList<String> skills;

	private Adress adress;

	@Email
	@NotNull(message = "Email.student.email")
	private String email;

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", hobby=" + hobby + ", mobile="
				+ mobile + ", DOB=" + DOB + ", skills=" + skills + ", adress="
				+ adress + ", email=" + email + "]";
	}

}

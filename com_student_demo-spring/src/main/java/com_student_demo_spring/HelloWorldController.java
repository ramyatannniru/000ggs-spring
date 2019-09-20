package com_student_demo_spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com_student_demo_spring.Student;

@Controller
public class HelloWorldController {
	
	
	
	@RequestMapping(method = RequestMethod.GET,name = "/showView")
	public String showHelloWorldForm()
	{
		return "helloworld-form";
	}

	@RequestMapping(method = RequestMethod.POST, name = "/processForm")
	public String processStudentForm()
	{
		return "hello-world";
	}
	@RequestMapping(method = RequestMethod.POST, name = "/processForm")
	
public String showForm(Model theModel) {
		
		// create a student object
		
		
		// add student object to the model
		theModel.addAttribute("c", new Student(1,"ramys","tsramrutha").toString());
		
		return "hello-world";
	}
	
	
	
}
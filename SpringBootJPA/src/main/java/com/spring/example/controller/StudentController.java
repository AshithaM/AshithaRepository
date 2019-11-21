package com.spring.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.example.bean.StudentBean;
import com.spring.example.repository.StudentrepoInterface;

@Controller
public class StudentController {
	
	@Autowired
	private StudentrepoInterface repo;
	
	@GetMapping("student")
	public String home() {
		System.out.println("home........");
		return "home";
	}
	
	@GetMapping("inserts")
	public String insert() {
		System.out.println("home........");
		return "insert";
	}
	
	@PostMapping("insertaction")
	public String insertDetails(StudentBean student) {
		repo.save(student);
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		return "home";
	}
	
	@GetMapping("allstudents")
	public String viewDetails(Model model) {
		List<StudentBean> studentList=new ArrayList<StudentBean>();
		studentList=repo.findAll();
		model.addAttribute("studentList",studentList);
		return "view";
	}
	
	
}

package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService sserv;
	
	@PostMapping("\show")
	public Student getStudent(@RequestParam String userid)
	{
		return sserv.getStudent(userid);
		
	}
}

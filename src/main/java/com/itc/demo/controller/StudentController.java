package com.itc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itc.demo.model.Student;
import com.itc.demo.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository repository;
	
	@PostMapping("/saveStudent")
	public String save(@RequestBody Student student) {
		String temp = "";
		System.out.println(student);
		System.out.println("Inside Controller save method");
		
		try {
		repository.save(student);
		temp = "Student saved succefully";
		}catch(Exception e) {
			temp = "error in saving student";
		}
		
		return temp;
	}
	@GetMapping("getAllStudents")
	public List<Student> findAll(){
		System.out.println("inside findAll");
		return repository.findAll();
	}
}

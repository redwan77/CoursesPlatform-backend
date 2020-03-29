package com.fs.tetouan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import com.fs.tetouan.repository.CourseRepository;

public class CourseController {
	
	@Autowired
	public CourseRepository repo ;

	
}

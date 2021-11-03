package com.sonata.Controller;


import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sonata.model.Student;
import com.sonata.Repository.StudentRepository;

@RestController
public class StudentController {
	
		@Autowired
		private StudentRepository prepository;

		@GetMapping("/students")
		public List<Student> getAllStudents() {
			return prepository.findAll();
		}
	}


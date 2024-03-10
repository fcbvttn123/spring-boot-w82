package ca.sheridancollege.vutran.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.vutran.beans.Student;
import ca.sheridancollege.vutran.service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value = {"", "/"})
	public List<Student> getCollection() {
		return studentService.findAll();
	}
	
	@PostMapping(value = {"", "/"})
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}
	
}

package ca.sheridancollege.vutran.boostrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.vutran.beans.Student;
import ca.sheridancollege.vutran.service.StudentService;

@Component 
public class StudentBootstrapData implements CommandLineRunner {
	
	@Autowired
	private StudentService studentService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s1 = new Student("Sally", 21);
		Student s2 = new Student("Jaspreet", 20);
		Student s3 = new Student("Xiao", 22);
		studentService.save(s1);
		studentService.save(s2);
		studentService.save(s3);
	}

}

package ca.sheridancollege.vutran.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sheridancollege.vutran.beans.Student;
import ca.sheridancollege.vutran.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired 
	private StudentRepo sr;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return sr.findAll();	
	}

	@Override
	public Optional<Student> findById(Long id) {
		// TODO Auto-generated method stub
		return sr.findById(id);
	}

	@Override
	public Optional<Student> findByName(String name) {
		// TODO Auto-generated method stub
		return sr.findByName(name);
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return sr.save(student);
	}

}

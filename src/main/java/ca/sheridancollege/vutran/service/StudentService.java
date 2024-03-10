package ca.sheridancollege.vutran.service;

import java.util.List;
import java.util.Optional;

import ca.sheridancollege.vutran.beans.Student;

public interface StudentService {
	public List<Student> findAll();
	public Optional<Student> findById(Long id);
	public Optional<Student> findByName(String name);
	public Student save(Student student);
}

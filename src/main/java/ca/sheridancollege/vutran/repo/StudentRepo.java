package ca.sheridancollege.vutran.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.vutran.beans.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
	public Optional<Student> findByName(String name);
}

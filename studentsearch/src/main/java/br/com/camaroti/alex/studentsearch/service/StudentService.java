package br.com.camaroti.alex.studentsearch.service;

import java.util.List;
import java.util.Optional;

import br.com.camaroti.alex.studentsearch.model.Student;

public interface StudentService {

	Student save(Student student);
	void delete(Student student);
	Student findOne(String id);
	Iterable<Student> findAll();
	List<Student> findByInteresses(String interesse);
}

package br.com.camaroti.alex.studentsearch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.camaroti.alex.studentsearch.model.Student;
import br.com.camaroti.alex.studentsearch.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	
	private StudentRepository studentRepository;

	@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	
	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void delete(Student student) {
		studentRepository.delete(student);
	}

	@Override
	public Student findOne(String id) {
		return studentRepository.findOne(id);
	}

	@Override
	public Iterable<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public List<Student> findByInteresses(String interesse) {
		return studentRepository.findByInteresses(interesse);
	}

}

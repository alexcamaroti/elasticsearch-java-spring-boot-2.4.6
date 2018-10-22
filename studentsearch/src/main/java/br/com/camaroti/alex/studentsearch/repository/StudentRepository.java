package br.com.camaroti.alex.studentsearch.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import br.com.camaroti.alex.studentsearch.model.Student;

@Repository
public interface StudentRepository extends ElasticsearchRepository<Student, String>{

	List<Student> findByInteresses(String interesse);
	
}

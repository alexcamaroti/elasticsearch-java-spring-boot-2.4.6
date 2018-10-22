package br.com.camaroti.alex.studentsearch.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import br.com.camaroti.alex.studentsearch.model.Student;
import br.com.camaroti.alex.studentsearch.service.StudentService;

@SpringBootApplication(scanBasePackages={"br.com.camaroti.alex.studentsearch"})
public class Application implements CommandLineRunner{

	@Autowired
	private ElasticsearchOperations es;
	
	@Autowired
	private StudentService studentService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);		
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		//Register
		//Student st1 = new Student("101", "Lucas Nobre", "Recife", "Desenvolvimento de Sistemas", "PE", "Brasil");
		//st1.setInteresses(new String[]{"games, youtube, fortnite"});				
		//studentService.save(st1);
		
		Student st2 = new Student("102", "Yago Nobre", "Fortaleza", "Designer", "CE", "Brasil");
		st2.setInteresses(new String[]{"empreendedorismo, youtube, fortnite"});				
		//studentService.save(st2);
		
		
		//FindByOne
		Student st3 = studentService.findOne("102");
		System.out.println(st3);		
		
		//Returning people interested in "sports". It means: futebol, voleibol, basket, society (everything related to sports).
		List<Student> students = studentService.findByInteresses("esportes");		
		for (int i = 0; i < students.size(); i++) {
			System.out.println("Nome: "+ students.get(i).getNome());
		}
		
		//Removing
		//studentService.delete(st2);
	
	}
	
	

}

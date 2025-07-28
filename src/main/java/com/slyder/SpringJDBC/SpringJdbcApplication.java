package com.slyder.SpringJDBC;

import com.slyder.SpringJDBC.model.Student;
import com.slyder.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
	  ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

	  Student s = context.getBean(Student.class);
	  s.setName("Rohan");
	  s.setRollNo(1);
	  s.setMask(99);

	  StudentService service = context.getBean(StudentService.class);

	  service.addStudent(s);

	  List<Student> studentList = service.getStudents();
		System.out.println(studentList);
	}

}

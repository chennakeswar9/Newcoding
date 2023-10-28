package com.springdatajpa.springdatajpa;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.springdatajpa.springdatajpa.entity.Guardian;
import com.springdatajpa.springdatajpa.entity.Student;
import com.springdatajpa.springdatajpa.repository.StudentRespository;

@SpringBootTest
@DataJpaTest
public class StudentRespositoryTest {
	
	@Autowired
	private StudentRespository studentRespository;
	
	
	@Test
	public void saveStudent()
	{
		Student student = Student.builder().emaailId("chenna@gmail.com")
				.firstName("chenna").lastname("keswar").build();
		studentRespository.save(student);
	}
	
	
	@Test
	public void savewithStudentGuardian()
	{
		Guardian guardian = Guardian.builder().guardianEmail("kudumu@gmail.com")
				.Mobile("123456789").build();
		Student student = Student.builder().emaailId("chenna@gmail.com")
				.firstName("chenna").lastname("keswar").guardian(guardian)
				.build();
		studentRespository.save(student);
	}
	public void printAllStudent() {
		List<Student> studentList = studentRespository.findAll();
		System.out.println(studentList);
	}
	public void printfindfirstNameStudent() {
		List<Student> studentList = studentRespository.findfirstNameStudent("chenna");
		System.out.println(studentList);
	}
	
	@Test
	public void findgetstudentbyemailaddress() {
		Student student = studentRespository.getstudentbyemailaddress("kudumu@gmail.com");
		System.out.println(student);
	}
}

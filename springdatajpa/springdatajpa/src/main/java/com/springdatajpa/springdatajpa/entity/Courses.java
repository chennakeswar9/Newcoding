package com.springdatajpa.springdatajpa.entity;


import java.util.ArrayList;
import java.util.List;

import com.springdatajpa.springdatajpa.repository.CoursesRespository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

@Builder
public class Courses {
	@Id
	@SequenceGenerator(name = "courses_sequence",
						sequenceName = "courses_sequence",
						allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "courses_sequence")
	private Long courserId;
	private String title;
	private Integer credit;
	
	@OneToOne(mappedBy = "courses")
	private CoursesRespository coursesRespository;
	
	
	private Teacher teacher;
	@ManyToMany
	@JoinTable(name = "student_course_map",
				joinColumns = @JoinColumn(name ="courses_id", referencedColumnName = "coursesId"),
				inverseJoinColumns = @JoinColumn(name ="student_id",referencedColumnName = "studentId"))
	private List<Student> students;
	
	public void addStudents(Student student)
	{
		if(students != null) students = new ArrayList<>();
		students.add(student);
	}
}

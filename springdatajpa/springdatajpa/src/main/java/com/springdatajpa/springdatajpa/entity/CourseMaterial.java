package com.springdatajpa.springdatajpa.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class CourseMaterial {
	
	@Id
	@SequenceGenerator(name = "courseMaterial_sequence",
						sequenceName = "coursematerial_sequence",
						allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "courseMaterial_sequence")
	private Long courseMaterialId;
	private String url;
	
	//fetch Easy or Lazy
	@OneToOne(cascade = CascadeType.ALL
			)
	@JoinColumn(name="",referencedColumnName = "coursesId")
	private Courses courses;
	
	
}

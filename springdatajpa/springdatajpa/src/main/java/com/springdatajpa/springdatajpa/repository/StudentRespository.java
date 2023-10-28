package com.springdatajpa.springdatajpa.repository;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springdatajpa.springdatajpa.entity.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRespository extends JpaRepository<Student, Long>{

	
	
	
	public default List<Student> findfirstNameStudent(String string) {
		return null;	
	}
	
	//JPQL based class
	@Query("select s from Student s where s.email.Id =?1")
	Student getstudentbyemailaddress(String emailId);
	
	//Native
	@Query(value = "select * from tbl_student",
	nativeQuery = true)
	Student getstudentbyemailaddressnative(String emailId);
	
	//Native and Param
	@Query(value = "select * from tbl_student s where s.email_address = :emailId",
			nativeQuery = true)
			Student getstudentbyemailaddressnativeparam(@Param("emailID")String emailId);
	
	@Modifying
	@Transactional
	@Query(value = "update tbl_student set first_name =?1 where email_address = :emailId",
	nativeQuery = true)
	int updateStudentnamebyEmailId(String firstName, String emailId);
}

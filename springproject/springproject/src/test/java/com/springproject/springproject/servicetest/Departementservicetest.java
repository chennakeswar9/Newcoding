package com.springproject.springproject.servicetest;


import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.springproject.springproject.entity.Department;
import com.springproject.springproject.error.Departmentnotfoundexception;
import com.springproject.springproject.respository.Departmentrepository;
import com.springproject.springproject.service.Departmentservice;

@SpringBootTest
public class Departementservicetest {
	@Autowired
	private Departmentservice departmentservice;
	
	@MockBean
	private Departmentrepository departmentrespository;
	
	@BeforeEach
	void Setup() {
		
		Class<Department> department = Department.class;
		
		Mockito.when(departmentrespository.findAll());
		
		
	}
	@Test
	public void whenvaildDepartmentname_thendepartemntshouldfound() throws Departmentnotfoundexception {
		String departmentname ="IT";
		Department found = departmentservice.fetchDepartmentByname(departmentname);
		assertEquals(departmentname, found.getDepartmentname());
	}
}

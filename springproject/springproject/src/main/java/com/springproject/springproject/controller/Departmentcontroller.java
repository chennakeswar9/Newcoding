package com.springproject.springproject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.springproject.entity.Department;
import com.springproject.springproject.error.Departmentnotfoundexception;
import com.springproject.springproject.service.Departmentservice;

import jakarta.validation.Valid;

@RestController
public class Departmentcontroller {
	
	@Autowired
	private Departmentservice departmentservice;
	
	private final Logger LOGGER = LoggerFactory.getLogger(Departmentcontroller.class);
	
	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department)
	{
		LOGGER.info("Inside savedepartment");
		return departmentservice.saveDepartment(department);
		
	}
	
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){
		LOGGER.info("Inside fetchdepartment");
		return departmentservice.fetchDepartmentList();
		
	}
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentBYId(@PathVariable("id") Long departmentId) throws Departmentnotfoundexception {
		return departmentservice.fetchDepartmentById(departmentId);
		
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentservice.deleteDepartmentById(departmentId);
		return "department deleted successfull" ;	
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartmentById(@PathVariable("id") Long departmentId,
			@RequestBody Department department)
	{
		return departmentservice.updateDepartmentById(departmentId, department);
		
	}
}

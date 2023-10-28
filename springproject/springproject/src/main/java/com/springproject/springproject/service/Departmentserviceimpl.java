package com.springproject.springproject.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.springproject.entity.Department;
import com.springproject.springproject.error.Departmentnotfoundexception;
import com.springproject.springproject.respository.Departmentrepository;


@Service
public class Departmentserviceimpl implements Departmentservice{

	
	
	@Autowired
	private Departmentrepository departmentrepository;
	
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentrepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return departmentrepository.findAll();
	}

	public Department fetchDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		Optional<Department> department = departmentrepository.findById(departmentId);
	
	return department.get();
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
	departmentrepository.deleteById(departmentId);
	}

	@Override
	public Department updateDepartmentById(Long departmentId, Department department) {
		// TODO Auto-generated method stub
		Department depDB = departmentrepository.findById(departmentId).get();
		
		
		if(Objects.nonNull(department.getDepartmentname()) && 
				!"".equalsIgnoreCase(department.getDepartmentname())) {
			depDB.setDepartmentname(department.getDepartmentname());
		}
		if(Objects.nonNull(department.getDepartmentaddress()) && 
				!"".equalsIgnoreCase(department.getDepartmentaddress())) {
			depDB.setDepartmentname(department.getDepartmentaddress());
		}
		if(Objects.nonNull(department.getDepartmentcode()) && 
				!"".equalsIgnoreCase(department.getDepartmentcode())) {
			depDB.setDepartmentname(department.getDepartmentcode());
		}
		return departmentrepository.save(depDB);
	}

	@Override
	public Department fetchDepartmentById(String departmentname) throws Departmentnotfoundexception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department fetchDepartmentByname(String departmentname) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	}



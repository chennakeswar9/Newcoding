package com.springproject.springproject.service;

import java.util.List;



import com.springproject.springproject.entity.Department;
import com.springproject.springproject.error.Departmentnotfoundexception;



public interface Departmentservice {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId) throws Departmentnotfoundexception ;

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartmentById(Long departmentId, Department department);

	Department fetchDepartmentById(String departmentname) throws Departmentnotfoundexception;

	public Department fetchDepartmentByname(String departmentname);



	

}

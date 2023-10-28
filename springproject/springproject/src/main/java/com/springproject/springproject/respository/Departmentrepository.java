package com.springproject.springproject.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.springproject.entity.Department;

@Repository
public interface Departmentrepository extends JpaRepository<Department, Long>{

}

package com.springboot.springpkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.springpkg.model.Employee;

@Repository
public interface EmployeeRepositry extends JpaRepository<Employee, Long>{

}

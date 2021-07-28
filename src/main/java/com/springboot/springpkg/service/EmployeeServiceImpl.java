package com.springboot.springpkg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.springpkg.model.Employee;
import com.springboot.springpkg.repository.EmployeeRepositry;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
	
	@Autowired
	private EmployeeRepositry employeeRepositry;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepositry.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepositry.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional = employeeRepositry.findById(id);
		Employee employee =null;
		if(optional.isPresent()) {
			employee = optional.get();
		}else {
			throw new RuntimeException("Employee not found for id ::" +id);
			
		}
		return employee;
	}
	
	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepositry.deleteById(id);
	}
}

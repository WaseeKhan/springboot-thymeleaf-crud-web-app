package com.lucifer.lab.service;

import com.lucifer.lab.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);


}

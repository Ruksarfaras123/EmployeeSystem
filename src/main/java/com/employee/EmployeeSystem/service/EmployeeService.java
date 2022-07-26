package com.employee.EmployeeSystem.service;

import com.employee.EmployeeSystem.model.Employee;
import com.employee.EmployeeSystem.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class EmployeeService {

    @Inject
    EmployeeRepository employeeRepository;

    public Employee getById(Long empId)
    {
        return employeeRepository.findById(empId).get();

    }

    public List<Employee> getAllEmployeeDetails()
    {
        return employeeRepository.findAll();
    }

    public Employee addNewEmployee(Employee employee)
    {
       return employeeRepository.save(employee);
    }
}

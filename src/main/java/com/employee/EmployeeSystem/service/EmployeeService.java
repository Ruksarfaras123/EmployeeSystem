package com.employee.EmployeeSystem.service;

import com.employee.EmployeeSystem.model.Employee;
import com.employee.EmployeeSystem.repository.EmployeeRepository;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Inject
    EmployeeRepository employeeRepository;

    public Employee getById(int empId) {
        try {
            Employee employee =employeeRepository.findById(Long.valueOf(empId)).get();
            Hibernate.initialize(employee.getFinance());
            Hibernate.initialize(employee.getProject());
            Hibernate.initialize(employee.getAttendance());
            System.out.println("Employee object=======>"+employee.getContactNumber());
            return employee;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Employee> getAllEmployeeDetails() {
        return employeeRepository.findAll();
    }

    public Employee addNewEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}

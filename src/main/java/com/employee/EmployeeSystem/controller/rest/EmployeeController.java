package com.employee.EmployeeSystem.controller.rest;

import com.employee.EmployeeSystem.model.Employee;
import com.employee.EmployeeSystem.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
public class EmployeeController {

    @Inject
    EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getById(@PathVariable int id )
    {
        return new ResponseEntity<Employee>(employeeService.getById(id), HttpStatus.OK);
    }

    @PostMapping("/employee/getAll")
    public List<Employee> getAllEmployeeDetails()
    {
       return employeeService.getAllEmployeeDetails();
    }

    @PostMapping("/employee/addNew")
    public ResponseEntity<Employee> addNewEmployee(@RequestBody Employee employee)
    {
        return new ResponseEntity<>( employeeService.addNewEmployee(employee),HttpStatus.OK);
    }
//    @PostMapping("/employee/update/{id}")
//    public ResponseEntity<Employee> updateEmployeeDetailById(@PathVariable Long id ,Employee e)
//    {
//
//    }


}


//getById
//getAll details
//update
//delete
//set project details
// get project details
// get attendance

package com.employee.EmployeeSystem.controller;

import com.employee.EmployeeSystem.model.Employee;
import com.employee.EmployeeSystem.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
public class EmployeeController {

    @Inject
    EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getById(@PathVariable Long id )
    {
        if (id instanceof Long)
        {
            return new ResponseEntity("Incorrect type of employee id", HttpStatus.NOT_ACCEPTABLE);
        }

        return new ResponseEntity(
            "details  " + employeeService.getById(id), HttpStatus.OK);
    }

    @PostMapping("/employee/getAll")
    public List<Employee> getAllEmployeeDetails()
    {
       return employeeService.getAllEmployeeDetails();
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

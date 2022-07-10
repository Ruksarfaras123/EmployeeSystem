package com.employee.EmployeeSystem.repository;

import com.employee.EmployeeSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{

}

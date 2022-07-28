package com.employee.EmployeeSystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "finance")
public class Finance {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long financeId;

    @Column(name ="emp_salary")
    private String salary ;

    @Column(name ="account_number")
    private String accountNumber;

    @Column(name ="ifsc_code")
    private String ifsc;

    @OneToOne(mappedBy = "finance")
    @JsonBackReference
    private Employee employee;

    public Finance() {
    }

    public Finance(Long financeId, String salary, String accountNumber, String ifsc, Employee employee) {
        this.financeId = financeId;
        this.salary = salary;
        this.accountNumber = accountNumber;
        this.ifsc = ifsc;
        this.employee = employee;
    }

    public Long getFinanceId() {
        return financeId;
    }

    public void setFinanceId(Long financeId) {
        this.financeId = financeId;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

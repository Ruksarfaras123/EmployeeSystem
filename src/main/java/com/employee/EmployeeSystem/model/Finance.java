package com.employee.EmployeeSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "finance")
public class Finance {
    @Column
    private String salary ;
    @Column
    private String accountNumber;
    @Column
    private String ifsc;


}

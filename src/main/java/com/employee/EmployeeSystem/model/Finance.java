package com.employee.EmployeeSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "finance")
public class Finance {

    @Column(name="finance_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long financeId;

    @Column(name ="emp_salary")
    private String salary ;

    @Column(name ="account_number")
    private String accountNumber;

    @Column(name ="ifsc_code")
    private String ifsc;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id")
    private Employee employee;


}

package com.employee.EmployeeSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Column(name="attendance_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attendanceId;

    @Column(name="total_working_days")
    private String totalWorkingDays ;

    @Column(name="days_worked")
    private  String daysWorked;

    @Column(name="holidays")
    private  String holidays;

    @Column(name="sick_leaves")
    public String sickLeaves ;

    @Column(name="on_leaves")
    public  String onLeave ;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id")
    private Employee employee;

}

package com.employee.EmployeeSystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Column(name="id")
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

    @OneToOne(mappedBy = "attendance")
    @JsonBackReference
    private Employee employee;

    public Attendance() {
    }

    public Attendance(Long attendanceId, String totalWorkingDays, String daysWorked, String holidays, String sickLeaves, String onLeave, Employee employee) {
        this.attendanceId = attendanceId;
        this.totalWorkingDays = totalWorkingDays;
        this.daysWorked = daysWorked;
        this.holidays = holidays;
        this.sickLeaves = sickLeaves;
        this.onLeave = onLeave;
        this.employee = employee;
    }

    public Long getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Long attendanceId) {
        this.attendanceId = attendanceId;
    }

    public String getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(String totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public String getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(String daysWorked) {
        this.daysWorked = daysWorked;
    }

    public String getHolidays() {
        return holidays;
    }

    public void setHolidays(String holidays) {
        this.holidays = holidays;
    }

    public String getSickLeaves() {
        return sickLeaves;
    }

    public void setSickLeaves(String sickLeaves) {
        this.sickLeaves = sickLeaves;
    }

    public String getOnLeave() {
        return onLeave;
    }

    public void setOnLeave(String onLeave) {
        this.onLeave = onLeave;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

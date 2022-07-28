package com.employee.EmployeeSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "employee")
public class Employee
{
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empId;

    @Column(name ="emp_name")
    private String empName;

    @Column(name ="emp_base_location")
    private String empBaseLocation;

    @Column(name ="emp_email")
    private String empEmail;

    @Column(name ="emp_doj")
    private String empDoj;

    @Column(name ="contact_number")
    private String contactNumber;

    @Column(name ="blood_group")
    private String bloodGroup;

    @Column(name ="dob")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dob;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="project_id",referencedColumnName = "id")
    @JsonManagedReference
    private Project project;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="finance_id",referencedColumnName = "id")
    @JsonManagedReference
    private Finance finance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="attendance_id",referencedColumnName = "id")
    @JsonManagedReference
    private  Attendance attendance;

    public Employee() {
    }

    public Employee(long empId, String empName, String empBaseLocation, String empEmail, String empDoj, String contactNumber, String bloodGroup, Date dob, Project project, Finance finance, Attendance attendance) {
        this.empId = empId;
        this.empName = empName;
        this.empBaseLocation = empBaseLocation;
        this.empEmail = empEmail;
        this.empDoj = empDoj;
        this.contactNumber = contactNumber;
        this.bloodGroup = bloodGroup;
        this.dob = dob;
        this.project = project;
        this.finance = finance;
        this.attendance = attendance;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpBaseLocation() {
        return empBaseLocation;
    }

    public void setEmpBaseLocation(String empBaseLocation) {
        this.empBaseLocation = empBaseLocation;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpDoj() {
        return empDoj;
    }

    public void setEmpDoj(String empDoj) {
        this.empDoj = empDoj;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Finance getFinance() {
        return finance;
    }

    public void setFinance(Finance finance) {
        this.finance = finance;
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }
}

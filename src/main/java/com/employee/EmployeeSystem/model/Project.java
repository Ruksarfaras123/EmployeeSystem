package com.employee.EmployeeSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {

    @Column(name ="project_id")
    @Id
    private String projectId;

    @Column(name ="project_manager")
    private String projectManager;

    @Column(name ="project_name")
    private String projectName ;

    @Column(name ="project_client")
    private String projectClient;

    @Column(name ="project_location")
    private String projectLocation;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id")
    private Employee employee;

}

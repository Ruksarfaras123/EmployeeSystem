package com.employee.EmployeeSystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {

    @Column(name = "id")
    @Id
    private String projectId;

    @Column(name = "project_manager")
    private String projectManager;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "project_client")
    private String projectClient;

    @Column(name = "project_location")
    private String projectLocation;

    @OneToOne(mappedBy = "project")
    @JsonBackReference
    private Employee employee;

    public Project() {
    }

    public Project(String projectId, String projectManager, String projectName, String projectClient, String projectLocation, Employee employee) {
        this.projectId = projectId;
        this.projectManager = projectManager;
        this.projectName = projectName;
        this.projectClient = projectClient;
        this.projectLocation = projectLocation;
        this.employee = employee;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectClient() {
        return projectClient;
    }

    public void setProjectClient(String projectClient) {
        this.projectClient = projectClient;
    }

    public String getProjectLocation() {
        return projectLocation;
    }

    public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}

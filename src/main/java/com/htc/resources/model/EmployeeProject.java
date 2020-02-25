package com.htc.resources.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by giris on 27/1/20.
 */
@Entity
@Table
public class EmployeeProject {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int employeeProjectId;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name="project_id")
    private Project project;

    @Column
    private String reportingTo;

    @Column
    private String location;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private boolean active;

    public EmployeeProject() {
    }

    public int getEmployeeProjectId() {
        return employeeProjectId;
    }

    public void setEmployeeProjectId(int employeeProjectId) {
        this.employeeProjectId = employeeProjectId;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    public String getReportingTo() {
        return reportingTo;
    }

    public void setReportingTo(String reportingTo) {
        this.reportingTo = reportingTo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

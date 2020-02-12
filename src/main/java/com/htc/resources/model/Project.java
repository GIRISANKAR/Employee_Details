package com.htc.resources.model;

import javax.persistence.*;

/**
 * Created by giris on 27/1/20.
 */
@Entity
@Table
public class Project {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int projectId;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    @Column
    private String projectName;

    @Column
    private String reportingTo;

    @Column
    private String deliveryHead;

    @Column
    private boolean active;

    public Project() {
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getReportingTo() {
        return reportingTo;
    }

    public void setReportingTo(String reportingTo) {
        this.reportingTo = reportingTo;
    }

    public String getDeliveryHead() {
        return deliveryHead;
    }

    public void setDeliveryHead(String deliveryHead) {
        this.deliveryHead = deliveryHead;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

package com.htc.resources.response;


/**
 * Created by giris on 10/2/20.
 */
public class EmployeeProjectResponse {

    private int EmployeeProjectId;

    private int projectId;

    private String projectName;

    private String reportingTo;

    private String location;

    private String startDate;

    private String  endDate;

    private String projectDescription;

    private String skillset;

    private String deliveryHead;

    private boolean active;

    public EmployeeProjectResponse() {
    }

    public int getEmployeeProjectId() {
        return EmployeeProjectId;
    }

    public void setEmployeeProjectId(int employeeProjectId) {
        EmployeeProjectId = employeeProjectId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
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

    public String getLocation() {
        return location;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getSkillset() {
        return skillset;
    }

    public void setSkillset(String skillset) {
        this.skillset = skillset;
    }

    public String getDeliveryHead() {
        return deliveryHead;
    }

    public void setDeliveryHead(String deliveryHead) {
        this.deliveryHead = deliveryHead;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

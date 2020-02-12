package com.htc.resources.response;

/**
 * Created by giris on 10/2/20.
 */
public class ProjectResponse {

    private int projectId;

    private String projectName;

    private String reportingTo;

    private String deliveryHead;

    public ProjectResponse() {
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

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getProjectId() {
        return projectId;
    }
}

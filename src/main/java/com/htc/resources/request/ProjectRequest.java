package com.htc.resources.request;

/**
 * Created by giris on 27/2/20.
 */
public class ProjectRequest {

    private String projectName;

    private String projectDescription;

    private String deliveryHead;

    private  String skillSet;

    public ProjectRequest() {
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getDeliveryHead() {
        return deliveryHead;
    }

    public void setDeliveryHead(String deliveryHead) {
        this.deliveryHead = deliveryHead;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }
}

package com.htc.resources.model;

import javax.persistence.*;


/**
 * Created by giris on 17/2/20.
 */
@Entity
@Table
public class Project {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int projectId;

    @Column
    private String projectName;

    @Column
    private String projectDescription;

    @Column
    private String deliveryHead;

    @Column
    private  String skillSet;

    public Project() {
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

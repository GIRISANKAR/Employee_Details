package com.htc.resources.model;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by giris on 24/1/20.
 */
@Entity
@Table
public class Employee {

    @Id
    @Column
    private int empId;

    @Column
    private String empName;

    @Column
    private String designation;

    @Column
    private String primaryWorkLocation;

    @Column
    private int htcExperience;

    @Column
    private  int overallExperience;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "personal_details_id")
    private PersonalDetails personalDetails;

    @OneToMany(mappedBy = "employee" , cascade = {CascadeType.ALL})
    private List<Skill> skillList;

    @OneToMany(mappedBy = "employee" , cascade = {CascadeType.ALL})
    private List<Project> projectList;



    @Column
    private Date createdDate;

    @Column
    private boolean active;

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPrimaryWorkLocation() {
        return primaryWorkLocation;
    }

    public void setPrimaryWorkLocation(String primaryWorkLocation) {
        this.primaryWorkLocation = primaryWorkLocation;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getHtcExperience() {
        return htcExperience;
    }

    public void setHtcExperience(int htcExperience) {
        this.htcExperience = htcExperience;
    }

    public int getOverallExperience() {
        return overallExperience;
    }

    public void setOverallExperience(int overallExperience) {
        this.overallExperience = overallExperience;
    }
}
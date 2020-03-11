package com.htc.resources.request;


import java.util.List;

/**
 * Created by giris on 27/1/20.
 */
public class EmployeeRequest {

    private int empId;

    private String empName;

    private String designation;

    private String primaryWorkLocation;

    private int htcExperience;

    private  int overallExperience;

    private String primarySkills;

    private int personalDetailsId;

    private String officialEmailAddr;

    private String EmailAddr;

    private int extensionNumber;

    private String mobileNumber;

    private String alternativeMobileNumber;

    private int addressId;

    private String addressLine;

    private String city;

    private String state;

    private String country;

    private int pincode;

    private boolean active;


    //@JsonIgnore
    private List<EmployeeSkillRequest> skills;

    //@JsonIgnore
    private List<EmployeeProjectRequest> projects;

    private List<TrainingRequest> trainings;

    public EmployeeRequest() {
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

    public int getPersonalDetailsId() {
        return personalDetailsId;
    }

    public void setPersonalDetailsId(int personalDetailsId) {
        this.personalDetailsId = personalDetailsId;
    }

    public String getOfficialEmailAddr() {
        return officialEmailAddr;
    }

    public void setOfficialEmailAddr(String officialEmailAddr) {
        this.officialEmailAddr = officialEmailAddr;
    }

    public String getEmailAddr() {
        return EmailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        EmailAddr = emailAddr;
    }

    public int getExtensionNumber() {
        return extensionNumber;
    }

    public void setExtensionNumber(int extensionNumber) {
        this.extensionNumber = extensionNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAlternativeMobileNumber() {
        return alternativeMobileNumber;
    }

    public void setAlternativeMobileNumber(String alternativeMobileNumber) {
        this.alternativeMobileNumber = alternativeMobileNumber;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public List<EmployeeSkillRequest> getSkills() {
        return skills;
    }

    public void setSkills(List<EmployeeSkillRequest> skills) {
        this.skills = skills;
    }

    public List<EmployeeProjectRequest> getProjects() {
        return projects;
    }

    public String getPrimarySkills() {
        return primarySkills;
    }

    public void setPrimarySkills(String primarySkills) {
        this.primarySkills = primarySkills;
    }

    public void setProjects(List<EmployeeProjectRequest> projects) {
        this.projects = projects;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<TrainingRequest> getTrainings() {
        return trainings;
    }

    public void setTrainings(List<TrainingRequest> trainings) {
        this.trainings = trainings;
    }
}

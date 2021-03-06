package com.htc.resources.request;

/**
 * Created by giris on 27/1/20.
 */
public class EmployeeSkillRequest {

    private int skillId;
    private String skillName;
    private int experience;

    public EmployeeSkillRequest() {
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }
}

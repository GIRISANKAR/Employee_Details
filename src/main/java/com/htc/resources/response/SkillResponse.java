package com.htc.resources.response;

/**
 * Created by giris on 10/2/20.
 */
public class SkillResponse {
    private int skillId;

    private String skillName;

    private int experience;

    public SkillResponse() {
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

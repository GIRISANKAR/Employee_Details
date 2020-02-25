package com.htc.resources.model;

import javax.persistence.*;

/**
 * Created by giris on 17/2/20.
 */
@Entity
@Table
public class EmployeeSkill {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int skillId;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    @Column
    private String skillName;

    @Column
    private int experience;

    public EmployeeSkill() {
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
}

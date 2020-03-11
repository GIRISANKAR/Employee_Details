package com.htc.resources.model;

import javax.persistence.*;

/**
 * Created by giris on 27/2/20.
 */
@Entity
@Table
public class Training {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int trainingId;

    @Column
    private String nameOfTraining;

    @Column
    private String trainingDescription;

    @Column
    private String duration;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    public Training() {
    }

    public int getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }

    public String getNameOfTraining() {
        return nameOfTraining;
    }

    public void setNameOfTraining(String nameOfTraining) {
        this.nameOfTraining = nameOfTraining;
    }

    public String getTrainingDescription() {
        return trainingDescription;
    }

    public void setTrainingDescription(String trainingDescription) {
        this.trainingDescription = trainingDescription;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

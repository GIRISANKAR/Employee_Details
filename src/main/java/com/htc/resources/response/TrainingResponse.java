package com.htc.resources.response;

/**
 * Created by giris on 27/2/20.
 */
public class TrainingResponse {

    private int trainingId;

    private String nameOfTraining;

    private String trainingDescription;

    private String duration;

    public TrainingResponse() {
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
}

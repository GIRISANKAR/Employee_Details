package com.htc.resources.model;

import java.util.List;

/**
 * Created by giris on 24/2/20.
 */
public class Response {

    private String message;

    private List<String> errors;

    private boolean status;

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

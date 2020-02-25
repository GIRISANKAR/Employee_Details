package com.htc.resources.model;

import javax.persistence.*;

/**
 * Created by giris on 24/1/20.
 */
@Entity
@Table
public class SystemParameter {

     @Id
     @Column
     private int id;

     @Column
     private String paramName;

     @Column
     private String value;

    @Column
    private boolean active;

    public SystemParameter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

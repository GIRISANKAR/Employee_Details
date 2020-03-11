package com.htc.resources.request;

/**
 * Created by giris on 2/3/20.
 */
public class SystemParameterRequest {

    private String paramName;

    private String value;

    public SystemParameterRequest() {
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
}

package com.validator.domain;

/**
 * Created by Kalvin on 8/11/2015.
 */
public class Password {
    private String text;
    private Boolean valid;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

}

package com.validator.algo;

/**
 * Created by Kalvin on 8/11/2015.
 */
public interface ValidatorAlgo {
    public Boolean isValid(String passwordString);
    public String getErrorMessage();
}

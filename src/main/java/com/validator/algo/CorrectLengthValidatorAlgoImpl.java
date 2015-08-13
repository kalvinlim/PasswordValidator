package com.validator.algo;

import com.validator.domain.Password;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

/**
 * Created by Kalvin on 8/12/2015.
 */
@Component
/**
 * Algo to check if password string is between 5-12 characters in length
 */
public class CorrectLengthValidatorAlgoImpl implements ValidatorAlgo {
    @Override
    public Boolean isValid(String passwordString) {
        String regexExpression = "^(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]+)$";
        return Pattern.matches(regexExpression, passwordString);
    }
}

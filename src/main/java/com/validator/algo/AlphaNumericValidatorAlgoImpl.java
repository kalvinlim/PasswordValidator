package com.validator.algo;

import com.validator.domain.Password;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

/**
 * Created by Kalvin on 8/11/2015.
 */
@Component
public class AlphaNumericValidatorAlgoImpl implements ValidatorAlgo {
    @Override
    public Boolean isValid(Password password) {
        String r = "^(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]+)$";
        return Pattern.matches(r, password.getText());
    }
}

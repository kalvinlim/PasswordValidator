package com.validator.algo;

import com.validator.domain.Password;
import org.springframework.stereotype.Component;

/**
 * Created by Kalvin on 8/12/2015.
 */
@Component
/**
 * Algo to check that password string does not contain any sequence of characters immediately followed by
 * the same sequence
 */
public class SequenceValidatorAlgoImpl implements ValidatorAlgo{
    @Override
    public Boolean isValid(String passwordString) {
        return null;
    }
}

package com.validator.service;

import com.validator.algo.AlphaNumericValidatorAlgoImpl;
import com.validator.algo.CorrectLengthValidatorAlgoImpl;
import com.validator.algo.SequenceValidatorAlgoImpl;
import com.validator.algo.ValidatorAlgo;
import com.validator.domain.Password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Kalvin on 8/11/2015.
 */
@Service
public class ValidatorServiceImpl implements ValidatorService {
    @Autowired private AlphaNumericValidatorAlgoImpl alphaNumeric;
    @Autowired private CorrectLengthValidatorAlgoImpl correctLengthValidatorAlgo;
    @Autowired private SequenceValidatorAlgoImpl sequenceValidatorAlgo;

    private List<ValidatorAlgo> validationAlgos;


    ValidatorServiceImpl(ValidatorAlgo ... args){
        for(ValidatorAlgo arg : args){
            System.out.println(arg);
        }
    }

    @Override
    public Boolean validate(Password password) {
        return null;
    }
}

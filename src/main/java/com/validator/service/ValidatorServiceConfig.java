package com.validator.service;

import com.validator.algo.AlphaNumericValidatorAlgoImpl;
import com.validator.algo.CorrectLengthValidatorAlgoImpl;
import com.validator.algo.SequenceValidatorAlgoImpl;
import com.validator.algo.ValidatorAlgo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.validation.Validator;

/**
 * Created by Kalvin on 8/12/2015.
 */
@Configuration
public class ValidatorServiceConfig {

    @Autowired AlphaNumericValidatorAlgoImpl alphaNumericValidatorAlgoImpl;
    @Autowired CorrectLengthValidatorAlgoImpl correctLengthValidatorAlgo;
    @Autowired SequenceValidatorAlgoImpl sequenceValidatorAlgo;

    @Bean
    public ValidatorService validatorService(){
        return new ValidatorServiceImpl(alphaNumericValidatorAlgoImpl, correctLengthValidatorAlgo, sequenceValidatorAlgo);
    }
}

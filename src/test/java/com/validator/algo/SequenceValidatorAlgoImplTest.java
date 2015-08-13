package com.validator.algo;

import com.validator.password.init.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Kalvin on 8/12/2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class SequenceValidatorAlgoImplTest {

    static Logger logger = LoggerFactory.getLogger(SequenceValidatorAlgoImplTest.class);

    @Autowired AlphaNumericValidatorAlgoImpl alphaNumericValidatorAlgo;


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void whenContextIsBootstrapped_thenNoExceptions() {
        assert true;
    }

    @Test
    public void isValidTest(){
        assert alphaNumericValidatorAlgo.isValid("a1");
        assert alphaNumericValidatorAlgo.isValid("1a");
        assert alphaNumericValidatorAlgo.isValid("aa11");
        assert alphaNumericValidatorAlgo.isValid("a1a1");
        assert alphaNumericValidatorAlgo.isValid("1a1a");
        assert !alphaNumericValidatorAlgo.isValid("!!!!");
    }
}

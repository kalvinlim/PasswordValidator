package com.validator.algo;

import com.validator.domain.Password;
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
public class AlphaNumericValidatorAlgoImplTest {

    static Logger logger = LoggerFactory.getLogger(AlphaNumericValidatorAlgoImplTest.class);

    @Autowired AlphaNumericValidatorAlgoImpl alphaNumericValidatorAlgo;
    private Password password;

    @Before
    public void setUp() throws Exception {
        password = new Password();
        password.setValid(false);
    }

    @Test
    public void whenContextIsBootstrapped_thenNoExceptions() {
        assert true;
    }

    @Test
    public void isValidTest(){
        password.setText("a1");
        assert alphaNumericValidatorAlgo.isValid(password);

        password.setText("1a");
        assert alphaNumericValidatorAlgo.isValid(password);

        password.setText("aa11");
        assert alphaNumericValidatorAlgo.isValid(password);

        password.setText("a1a1");
        assert alphaNumericValidatorAlgo.isValid(password);

        password.setText("1a1a");
        assert alphaNumericValidatorAlgo.isValid(password);

        password.setText("!!!!");
        assert !alphaNumericValidatorAlgo.isValid(password);
    }
}

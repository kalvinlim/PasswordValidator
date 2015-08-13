package com.validator.controller;

import com.validator.domain.Password;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kalvin on 8/11/2015.
 */
@RestController
public class PasswordValidatorController {

    @RequestMapping("/")
    @ResponseBody
    public Password foo() {
        return new Password();
    }


}
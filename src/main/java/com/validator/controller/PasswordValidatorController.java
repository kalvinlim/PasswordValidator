package com.validator.controller;

import com.validator.domain.Password;
import com.validator.service.ValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private ValidatorService validatorService;

    @RequestMapping("/")
    @ResponseBody
    public Password handlePasswordValidation() {
        return new Password();
    }


}
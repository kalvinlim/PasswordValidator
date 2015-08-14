package com.validator.controller;

import com.validator.domain.Password;
import com.validator.service.ValidatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kalvin on 8/11/2015.
 */
@RestController
@RequestMapping("/api")
public class PasswordValidatorController {
    static Logger logger = LoggerFactory.getLogger(PasswordValidatorController.class);

    @Autowired
    private ValidatorService validatorService;

    @RequestMapping("/validate/{passwordString}")
    @ResponseBody
    public Password handlePasswordValidation(@PathVariable String passwordString) {
        return validatorService.validate(passwordString);
    }


}
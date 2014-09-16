package com.realdolmen.registration.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String>    {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private static final String EMAIL_END = "@realdolmen.com";
    @Override
    public void initialize(Email email) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        logger.info("isValid: " + s);
        return s != null && !s.trim().equals("") && s.endsWith(EMAIL_END) && !s.startsWith(EMAIL_END);
    }
}

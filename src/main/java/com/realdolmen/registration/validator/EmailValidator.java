package com.realdolmen.registration.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String>    {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailValidator.class);
    private static final String EMAIL_END = "@realdolmen.com";
    @Override
    public void initialize(Email email) {
        // Empty because it is mandatory to implement
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        LOGGER.info("isValid: " + s);
        return !"".equals(s) && s.endsWith(EMAIL_END) && !s.startsWith(EMAIL_END);
    }
}

package com.realdolmen.registration.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AccountNumberValidator implements ConstraintValidator<CorrectAccountNumber, String> {
    @Override
    public void initialize(CorrectAccountNumber accountNumber) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}

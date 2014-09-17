package com.realdolmen.registration.validator;

import com.realdolmen.registration.converter.AccountNumber;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AccountNumberValidator.class)
public @interface CorrectAccountNumber {
    String message() default "{com.realdolmen.registration.validator.AccountNumber.message}";
    Class<AccountNumber>[] groups() default {};
    Class<Payload>[] payload() default {};
}

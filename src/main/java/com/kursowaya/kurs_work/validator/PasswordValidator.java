package com.kursowaya.kurs_work.validator;

import com.kursowaya.kurs_work.model.Customer;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PasswordValidator implements Validator {
    @Override
    public boolean supports(Class<?> paramClass) {
        return Customer.class.equals(paramClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;
        if (customer.getPassword().length() < 6 || customer.getPassword().length() > 30) {
            errors.rejectValue("password", null, "Password must be between 6 and 30 character");
        }
    }
}
package com.kursowaya.kurs_work.validator;

import com.kursowaya.kurs_work.model.Services;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ServicesFormValidator implements Validator {
    //which objects can be validated by this validator
    @Override
    public boolean supports(Class<?> paramClass) {
        return Services.class.equals(paramClass);
    }

    //error code=messages.properties key
    @Override
    public void validate(Object target, Errors errors) {
        Services product = (Services) target;
        if (product.getServicesCategory().equalsIgnoreCase("NONE")) {
            errors.rejectValue("servicesCategory", "empty", "Please select a services category");
        }
		/*
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"servicesPrice","empty","ServicesPrice can not be empty");
	    */
    }
}
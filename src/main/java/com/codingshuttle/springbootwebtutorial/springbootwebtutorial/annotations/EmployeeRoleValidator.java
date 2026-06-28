package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class EmployeeRoleValidator implements ConstraintValidator<EmployeeRoleValidations, String> {
    @Override
    public boolean isValid(String inputRole, ConstraintValidatorContext context) {
        List<String> role= List.of("ADMIN","USER");
        return role.contains(inputRole);
    }
}

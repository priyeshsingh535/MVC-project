package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {EmployeeRoleValidator.class})
public @interface  EmployeeRoleValidations {
    String message() default "Role of employee can either be ADMIN or USER";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}

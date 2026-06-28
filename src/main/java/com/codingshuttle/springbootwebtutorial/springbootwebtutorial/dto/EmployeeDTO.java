package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.dto;

import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.annotations.EmployeeRoleValidations;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private Long id;

    @NotBlank(message = "name of the employee can not be blank")
    @Size(min = 3, max = 10, message = "characters in the name should be in range [3,10]")
    private String name;

    @Email(message = "email should be valid")
    private String email;

    @Max(value = 50, message = "age should not be greater than 50")
    @Min(value = 18, message = "Age should not ne less than 18")
    private Integer age;

    @PastOrPresent(message = "joining data can either be past or present")
    private LocalDate dateOfJoining;

    @NotBlank(message = "Role can not be empty")
    @EmployeeRoleValidations
//    @Pattern(regexp = "^(ADMIN|USER)$", message = "Role can be ADMIN or USER")
    private String role;

    @AssertTrue(message = "Employee should be active")
    @JsonProperty("isActive")
    private Boolean isActive;

    @NotNull
    @Positive(message = "Salary can not be negative")
    @Digits(integer = 7, fraction = 2, message = "salary of employee should be in the digit range")
    @DecimalMax(value = "10000.99")
    @DecimalMin(value = "100.50")
    private Double salary;
}

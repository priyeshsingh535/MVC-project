package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.controllers;


import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage() {
//        return "Secret message: asdfal@#$DASD";
//    }

    @GetMapping(path="/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name= "employeeId") Long id)
    {
        return new EmployeeDTO(id, "Priyesh", 25, "Priyesh@gmail.com", LocalDate.of(2024,02,03),true);
    }

    @GetMapping
    public String  getAllEmployee(@RequestParam (required = false) int age)
    {
        return "Hi age is :"+age;
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee)
    {
        inputEmployee.setId(200L);
        return inputEmployee;
    }
}











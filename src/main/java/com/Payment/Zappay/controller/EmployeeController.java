package com.Payment.Zappay.controller;

import com.Payment.Zappay.dto.EmployeeDto;
import com.Payment.Zappay.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity <EmployeeDto> createEmployee (@RequestBody  EmployeeDto employeeDto){
        EmployeeDto saveEmployee = employeeService.createEmployee(employeeDto);
        return  new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }
}

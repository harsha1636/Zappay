package com.Payment.Zappay.controller;

import com.Payment.Zappay.dto.EmployeeDto;
import com.Payment.Zappay.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    //Adding an Employee
    //http://127.0.0.1:3000/api/employees
    @PostMapping
    public ResponseEntity <EmployeeDto> createEmployee (@RequestBody  EmployeeDto employeeDto){
        EmployeeDto saveEmployee = employeeService.createEmployee(employeeDto);
        return  new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }

    //Get employee details by ID
    //http://localhost:3000/api/employees/1
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployee (@PathVariable("id") Long employeeId){
        EmployeeDto getEmployee = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(getEmployee);
    }

    //Get all employee details
    //http://localhost:3000/api/employees
    @GetMapping
    public  ResponseEntity<List<EmployeeDto>> getAllEmployees (){
        List<EmployeeDto> employeeDetails = employeeService.getAllEmployees();
        return ResponseEntity.ok(employeeDetails);
    }

    //Update employee details
    //http://localhost:3000/api/employees/1 --> make the changes in the body and send the data
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,
                                                      @RequestBody EmployeeDto updatedEmployee){
        EmployeeDto employeeDto = employeeService.updateEmployee(employeeId, updatedEmployee);
        return ResponseEntity.ok(employeeDto);
    }

    //Delete employee Details
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok(" Employee details deleted successfully! ");
    }
}

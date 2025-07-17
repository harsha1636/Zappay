package com.Payment.Zappay.service.impl;

import com.Payment.Zappay.dto.EmployeeDto;
import com.Payment.Zappay.entity.Employee;
import com.Payment.Zappay.mapper.EmployeeMapper;
import com.Payment.Zappay.repository.EmployeeRepository;
import com.Payment.Zappay.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
     public EmployeeDto createEmployee(EmployeeDto employeeDto){
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}


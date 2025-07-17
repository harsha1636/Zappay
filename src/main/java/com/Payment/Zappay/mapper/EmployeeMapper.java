package com.Payment.Zappay.mapper;

import com.Payment.Zappay.dto.EmployeeDto;
import com.Payment.Zappay.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface EmployeeMapper {

        public static EmployeeDto mapToEmployeeDto(Employee employee){
            return new EmployeeDto(
                    employee.getId(),
                    employee.getFirstName(),
                    employee.getLastName(),
                    employee.getEmail()
            );
        }
        public static Employee mapToEmployee(EmployeeDto employeeDto){
            return new Employee(
                    employeeDto.getId(),
                    employeeDto.getFirstName(),
                    employeeDto.getLastName(),
                    employeeDto.getEmail()
            );
        }

//    EmployeeMapper employeeMapper = Mappers.getMapper(EmployeeMapper.class);
//    EmployeeDto mapToEmployeeDto(Employee employee);
//    Employee mapToEmployee(EmployeeDto employeeDto);

}

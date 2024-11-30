package com.example.emsbackend.Mapper;

import com.example.emsbackend.Dto.EmployeeDto;
import com.example.emsbackend.Entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto()(
                employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail()
                );
    }
}

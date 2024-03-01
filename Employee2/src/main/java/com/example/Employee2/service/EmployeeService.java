package com.example.Employee2.service;

import com.example.Employee2.repository.entity.EmployeeEntity;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface EmployeeService {
    List<EmployeeEntity> findAllEmployee();
    Optional<EmployeeEntity> findById(UUID id);
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
    EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
    void deleteEmployee(UUID id);


    Page<EmployeeEntity> getemployeepagination(int offset, int pageSize);
}

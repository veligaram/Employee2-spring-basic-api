package com.example.Employee2.service.impl;

import com.example.Employee2.repository.entity.EmployeeEntity;
import com.example.Employee2.repository.EmployeeRepository;
import com.example.Employee2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private  EmployeeRepository employeeRepository;
    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(UUID id) {
        return employeeRepository.findById(id);
    }


    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public void deleteEmployee(UUID id) {
        employeeRepository.deleteById(id);

    }
    public Page<EmployeeEntity> getemployeepagination(int offset, int pageSize){
        return (Page<EmployeeEntity>) employeeRepository.findAll(PageRequest.of(offset, pageSize));
    }

    }


package com.example.Employee2.repository;

import com.example.Employee2.repository.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, UUID> {
}

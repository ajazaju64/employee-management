package com.devops1.employeemanagement.repository;

import com.devops1.employeemanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
package com.example.empmanagement.repository;

import com.example.empmanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {



}
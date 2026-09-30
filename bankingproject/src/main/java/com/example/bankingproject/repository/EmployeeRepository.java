package com.example.bankingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankingproject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

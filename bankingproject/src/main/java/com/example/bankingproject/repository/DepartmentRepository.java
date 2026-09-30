package com.example.bankingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankingproject.entity.Department;


public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}

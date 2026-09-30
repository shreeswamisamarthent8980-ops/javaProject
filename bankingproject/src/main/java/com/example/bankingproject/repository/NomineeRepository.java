package com.example.bankingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankingproject.entity.Nominee;

public interface NomineeRepository extends JpaRepository<Nominee, Integer>{

}

package com.example.bankingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankingproject.entity.Bank;

@Repository
public interface BankRespository extends JpaRepository<Bank, Integer> {

}

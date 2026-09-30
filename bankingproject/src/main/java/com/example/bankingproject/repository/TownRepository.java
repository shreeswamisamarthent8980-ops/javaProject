package com.example.bankingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankingproject.entity.Town;

public interface TownRepository extends JpaRepository<Town, Integer>{

}

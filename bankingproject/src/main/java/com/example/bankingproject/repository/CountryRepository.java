package com.example.bankingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankingproject.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{

}

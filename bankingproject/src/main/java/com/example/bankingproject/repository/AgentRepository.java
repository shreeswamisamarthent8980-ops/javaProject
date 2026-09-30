package com.example.bankingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankingproject.entity.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Integer> {

}

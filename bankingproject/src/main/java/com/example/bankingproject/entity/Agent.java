package com.example.bankingproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Agent {
	@Id
	private int id;
	@Column(name="fullName", nullable=false)
	private String fullName;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mobNo;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aadhar;
	
	private String pancard;
	private String mail;
	
}

package com.example.bankingproject.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private int id;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMiddname() {
		return middname;
	}
	public void setMiddname(String middname) {
		this.middname = middname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAadhar() {
		return aadhar;
	}
	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}
	public int getMobNO() {
		return mobNO;
	}
	public void setMobNO(int mobNO) {
		this.mobNO = mobNO;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Column(name="fName",  nullable = false)
	private String fname;
	@Column(name="middName",  nullable = false)
	private String middname;
	@Column(name="lastName",  nullable = false)
	private String lname;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private String email;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int aadhar;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int mobNO;
	@DateTimeFormat
	@Column(nullable=false)
	private Date dob;
	
	private float sal;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String pan;
	private String designation;
	@ManyToOne
	Department dept;
	@ManyToOne
	Bank bank;
}

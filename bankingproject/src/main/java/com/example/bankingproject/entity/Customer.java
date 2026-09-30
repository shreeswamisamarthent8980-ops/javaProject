package com.example.bankingproject.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Customer {
	@Id
	private int id;
	@Column(name="fName",  nullable = false)
	private String fname;
	@Column(name="middName",  nullable = false)
	private String middname;
	@Column(name="lastName",  nullable = false)
	private String lname;
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(nullable=false)
	private String mail;
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(nullable=false)
	private String pan;
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(nullable=false)
	private int aadhar;
	
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(nullable=false)
	private int mobno;
	@DateTimeFormat
	@Column(nullable = false)
	private Date dob;
	private Address address;
	private Nominee nominee;
	
	@Transient
	private int otp;
	public Customer() {
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public int getAadhar() {
		return aadhar;
	}
	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public Nominee getNominee() {
		return nominee;
	}
	public void setNominee(Nominee nominee) {
		this.nominee = nominee;
	}
	
}

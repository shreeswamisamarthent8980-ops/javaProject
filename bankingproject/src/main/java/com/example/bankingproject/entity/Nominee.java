package com.example.bankingproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Nominee {
	@Id
	private int nid;
	@Column(name="fName",  nullable = false)
	private String fname;
	@Column(name="lastName",  nullable = false)
	private String lname;
	@Column(name="middName",  nullable = false)
	private String middname;
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(nullable=false)
	private int mobNo;
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(nullable=false)
	private  int aadhar;
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(nullable=false)
	private String pan;
	private String relation;
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMiddname() {
		return middname;
	}
	public void setMiddname(String middname) {
		this.middname = middname;
	}
	public int getMobNo() {
		return mobNo;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	public int getAadhar() {
		return aadhar;
	}
	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public Nominee() {
		super();
		// TODO Auto-generated constructor stub
	}

}

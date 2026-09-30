package com.example.bankingproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Town {
	@Id
	private int tocode;
	private String name;
	private int pin;
	public Town() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTocode() {
		return tocode;
	}
	public void setTocode(int tocode) {
		this.tocode = tocode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}

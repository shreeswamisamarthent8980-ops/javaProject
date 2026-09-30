package com.example.bankingproject.entity;

import jakarta.persistence.Entity;

@Entity
public class Address {
	private Country country;
	private States states;
	private District district;
	private Taluka talukas;
	private Town town;
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public States getStates() {
		return states;
	}
	public void setStates(States states) {
		this.states = states;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public Taluka getTalukas() {
		return talukas;
	}
	public void setTalukas(Taluka talukas) {
		this.talukas = talukas;
	}
	public Town getTown() {
		return town;
	}
	public void setTown(Town town) {
		this.town = town;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

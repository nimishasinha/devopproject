package com.simplilearn.employeeservice.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class emp {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int eno;
	private String name;
	private String address;
	private LocalDate dateOfJoin;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public emp(String name, String address, LocalDate dateOfJoin) {
		super();
		this.name = name;
		this.address = address;
		this.dateOfJoin = dateOfJoin;
	}
	
	
	

}

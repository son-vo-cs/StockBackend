package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "appuser")
public class AppUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name, email, password;
	private float fund, deposit;
	
	
	
	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public AppUser(long id, String name, String email, String password, float fund, float deposit) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.fund = fund;
		this.deposit = deposit;
	}




	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public float getFund() {
		return fund;
	}
	
	public void setFund(float fund) {
		this.fund = fund;
	}
	
	public float getDeposit() {
		return deposit;
	}
	
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	

}

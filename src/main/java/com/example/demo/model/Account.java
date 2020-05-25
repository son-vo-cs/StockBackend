package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
	
	private long id;
	private int shares;
	private String symbol;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

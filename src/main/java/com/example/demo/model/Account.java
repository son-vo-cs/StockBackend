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
	public Account(long id, int shares, String symbol) {
		super();
		this.id = id;
		this.shares = shares;
		this.symbol = symbol;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	

}

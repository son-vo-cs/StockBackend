package com.example.demo.model;

import javax.persistence.*;
@Entity
@Table(name = "history")
public class History {
	
	private String id, symbol, date;
	private int change;
	public History() {
		super();
		// TODO Auto-generated constructor stub
	}
	public History(String id, String symbol, String date, int change) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.date = date;
		this.change = change;
	}
	
	
}

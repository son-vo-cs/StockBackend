package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "perform")
public class Perform {
	
	private long id;
	private String date;
	private float price;
	public Perform() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Perform(long id, String date, float price) {
		super();
		this.id = id;
		this.date = date;
		this.price = price;
	}
	
	
}

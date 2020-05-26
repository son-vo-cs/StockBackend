package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "perform")
public class Perform {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long fid;
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

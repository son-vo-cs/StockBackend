package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "history")
public class History {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long fid;
	private long id;
	private String symbol, date;
	private int change;
	public History() {
		super();
		// TODO Auto-generated constructor stub
	}
	public History(long id, String symbol, String date, int change) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.date = date;
		this.change = change;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	
	
}

package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class Card {
	
	@Id
	private String cid;
	
	private long uid;
	private String name, expire;
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Card(String cid, long uid, String name, String expire) {
		super();
		this.cid = cid;
		this.uid = uid;
		this.name = name;
		this.expire = expire;
	}
	
	public String getCid() {
		return cid;
	}
	
	public void setCid(String cid) {
		this.cid = cid;
	}
	
	public long getUid() {
		return uid;
	}
	
	public void setUid(long uid) {
		this.uid = uid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getExpire() {
		return expire;
	}
	
	public void setExpire(String expire) {
		this.expire = expire;
	}
	
	
	
}

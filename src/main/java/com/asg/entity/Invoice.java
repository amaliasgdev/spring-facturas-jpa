package com.asg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "invoices")
public class Invoice {	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "amount")
	private String amount;
	
	public Invoice() {}
	
	public Invoice(Integer id, String name, String location, String amount) {		
		this.id = id;
		this.name = name;
		this.location = location;
		this.amount = amount;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getAmount() {
		return amount;
	}
	
	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", name=" + name + ", location=" + location + ", amount=" + amount + "]";
	}
	
	
	
}


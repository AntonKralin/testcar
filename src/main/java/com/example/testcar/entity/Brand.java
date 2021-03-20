package com.example.testcar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int		id;
	private String 	name;
	
	public Brand() {
		
	}

	public Brand(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int brand) {
		this.id = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{'brand':'" + id + "','name':'" + name + "'}";
	}
	
}

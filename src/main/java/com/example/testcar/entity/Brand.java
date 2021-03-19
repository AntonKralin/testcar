package com.example.testcar.entity;

public class Brand {
	private int		brand;
	private String 	name;
	
	public Brand() {
		
	}

	public Brand(int brand, String name) {
		super();
		this.brand = brand;
		this.name = name;
	}

	public int getBrand() {
		return brand;
	}

	public void setBrand(int brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{'brand':'" + brand + "','name':'" + name + "'}";
	}
	
}

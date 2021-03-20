package com.example.testcar.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ads {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int 	id;
	private String 	model;
	private String	body;
	private String	transmission;
	private int		miliage;
	private int		year;
	private int		price;
	private int		isdelete;
	
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    private Users	user;
	
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_brand")
	private Brand 	brand;
	
	public Ads() {
		
	}

	public Ads(int id, String model, String body, String transmission, int miliage, int year, int price, int isdelete,
			Users user, Brand brand) {
		super();
		this.id = id;
		this.model = model;
		this.body = body;
		this.transmission = transmission;
		this.miliage = miliage;
		this.year = year;
		this.price = price;
		this.isdelete = isdelete;
		this.user = user;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public int getMiliage() {
		return miliage;
	}

	public void setMiliage(int miliage) {
		this.miliage = miliage;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(int isdelete) {
		this.isdelete = isdelete;
	}


	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "{'id'='" + id + "', 'model'='" + model + "', 'body'='" + body + "', 'transmission'='" + transmission + "', 'miliage'='"
				+ miliage + "', 'year'='" + year + "', 'price'='" + price + "', 'isdelete'='" + isdelete + "', 'id_user'='" + user.getId()
				+ "', 'id_brand'='" + brand.getId() + "'}";
	}
	
	
	
}

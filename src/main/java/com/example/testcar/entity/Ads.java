package com.example.testcar.entity;

public class Ads {
	private int 	id;
	private String 	model;
	private String	body;
	private String	transmission;
	private int		miliage;
	private int		year;
	private int		price;
	private int		delete;
	private int		id_user;
	private int 	id_brand;
	
	public Ads() {
		
	}

	public Ads(int id, String model, String body, String transmission, int miliage, int year, int price, int delete,
			int id_user, int id_brand) {
		super();
		this.id = id;
		this.model = model;
		this.body = body;
		this.transmission = transmission;
		this.miliage = miliage;
		this.year = year;
		this.price = price;
		this.delete = delete;
		this.id_user = id_user;
		this.id_brand = id_brand;
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

	public int getDelete() {
		return delete;
	}

	public void setDelete(int delete) {
		this.delete = delete;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getId_brand() {
		return id_brand;
	}

	public void setId_brand(int id_brand) {
		this.id_brand = id_brand;
	}

	@Override
	public String toString() {
		return "{'id'='" + id + "', 'model'='" + model + "', 'body'='" + body + "', 'transmission'='" + transmission + "', 'miliage'='"
				+ miliage + "', 'year'='" + year + "', 'price'='" + price + "', 'delete'='" + delete + "', 'id_user'='" + id_user
				+ "', 'id_brand'='" + id_brand + "'}";
	}
	
	
	
}

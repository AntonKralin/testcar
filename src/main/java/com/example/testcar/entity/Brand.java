package com.example.testcar.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int		id;
	private String 	name;
	
	@OneToMany
	private List<Ads> ads;
	
	public Brand() {
		
	}

	public Brand(String name) {
		super();
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
	
	public List<Ads> getAds() {
		return ads;
	}

	public void setAds(List<Ads> ads) {
		this.ads = ads;
	}

	@Override
	public String toString() {
		return "{'id':'" + id + "','name':'" + name + "'}";
	}
	
}

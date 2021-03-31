package com.example.testcar.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int 	id;
	private String 	login;
	private String	password;
	private String	type;
	
	@OneToMany
	private List<Ads> ads;
	
	public Users() {
		
	}

	public Users( String login, String password, String type) {
		super();
		this.login = login;
		this.password = password;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public List<Ads> getAds() {
		return ads;
	}

	public void setAds(List<Ads> ads) {
		this.ads = ads;
	}

	@Override
	public String toString() {
		return "{'id':'" + id + "','login':'" + login + "','password':'"
				+ password + "','type':'" + type + "'}";
	} 
	
}

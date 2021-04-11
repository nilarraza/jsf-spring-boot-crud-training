package com.inovaitsys.fruitsurveyapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FruitServey {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;
	private String email;
	private String fruitpday;
	private String favfruit;
	private Boolean likebroch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFruitpday() {
		return fruitpday;
	}
	public void setFruitpday(String fruitpday) {
		this.fruitpday = fruitpday;
	}
	public String getFavfruit() {
		return favfruit;
	}
	public void setFavfruit(String favfruit) {
		this.favfruit = favfruit;
	}
	public Boolean getLikebroch() {
		return likebroch;
	}
	public void setLikebroch(Boolean likebroch) {
		this.likebroch = likebroch;
	}
	public FruitServey(int id, String name, String address, String email, String fruitpday, String favfruit,
			Boolean likebroch) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.fruitpday = fruitpday;
		this.favfruit = favfruit;
		this.likebroch = likebroch;
	}
	public FruitServey() {
		super();
	}
	
	

}

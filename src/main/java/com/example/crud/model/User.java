package com.example.crud.model;

public class User {

	private int id;
	private String name;
	private String doj;
	private String city;
	private String num;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String doj, String city, String num) {
		super();
		this.id = id;
		this.name = name;
		this.doj = doj;
		this.city = city;
		this.num = num;
	}
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
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	
}

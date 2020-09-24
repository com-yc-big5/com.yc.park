package com.yc.tc.tingche.bean;

import java.sql.Timestamp;

public class Admin implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String password;
	private String phone;
	private String email;
	private Timestamp caratDate;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Admin(Integer id, String name, String password, String phone, String email, Timestamp caratDate) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.caratDate = caratDate;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Timestamp getCaratDate() {
		return caratDate;
	}
	public void setCaratDate(Timestamp caratDate) {
		this.caratDate = caratDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}

package com.yc.tc.tingche.bean;

import java.sql.Timestamp;

public class admin implements java.io.Serializable{
	      
	/**       
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String password;
	private Timestamp caratDate;
	
	
	public admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public admin(Integer id, String name, String password, Timestamp caratDate) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.caratDate = caratDate;
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

package com.yc.tc.tingche.bean;

public class park {

	private Integer id;
	private String garage ;
	private double price;
	private Integer status ;
	private String size ;
	private Integer isLong ;
	
	public park() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGarage() {
		return garage;
	}

	public void setGarage(String garage) {
		this.garage = garage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getIsLong() {
		return isLong;
	}

	public void setIsLong(Integer isLong) {
		this.isLong = isLong;
	}

	public park(Integer id, String garage, double price, Integer status, String size, Integer isLong) {
		super();
		this.id = id;
		this.garage = garage;
		this.price = price;
		this.status = status;
		this.size = size;
		this.isLong = isLong;
	}

	
	
}

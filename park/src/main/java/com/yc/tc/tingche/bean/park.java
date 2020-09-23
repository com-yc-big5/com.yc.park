package com.yc.tc.tingche.bean;

public class park {

	private Integer id;
	private Integer garage_id ;
	private double price;
	private Integer status ;
	private String size ;
	private Integer isLong ;
	
	public park() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public park(Integer id, Integer garage_id, double price, Integer status, String size, Integer isLong) {
		super();
		this.id = id;
		this.garage_id = garage_id;
		this.price = price;
		this.status = status;
		this.size = size;
		this.isLong = isLong;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGarage_id() {
		return garage_id;
	}
	public void setGarage_id(Integer garage_id) {
		this.garage_id = garage_id;
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
	
}

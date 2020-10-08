package com.yc.tc.tingche.bean;

public class Park implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer num_id;
	private String garage ;
	private Double price;
	private Integer status ;
	private String size ;
	private Integer isLong ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNum_id() {
		return num_id;
	}
	public void setNum_id(Integer num_id) {
		this.num_id = num_id;
	}
	public String getGarage() {
		return garage;
	}
	public void setGarage(String garage) {
		this.garage = garage;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Park(Integer id, Integer num_id, String garage, Double price, Integer status, String size, Integer isLong) {
		super();
		this.id = id;
		this.num_id = num_id;
		this.garage = garage;
		this.price = price;
		this.status = status;
		this.size = size;
		this.isLong = isLong;
	}
	public Park() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}

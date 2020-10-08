package com.yc.tc.tingche.bean;

import java.sql.Timestamp;


public class Orders implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer user_id; 
	private Integer park_id;
	private String plate_num;
	private Timestamp orderCreateDate;
	private Timestamp unloadCreateDate;
	private Timestamp unloadDisDate;
	private Double total;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getPark_id() {
		return park_id;
	}
	public void setPark_id(Integer park_id) {
		this.park_id = park_id;
	}
	public String getPlate_num() {
		return plate_num;
	}
	public void setPlate_num(String plate_num) {
		this.plate_num = plate_num;
	}
	public Timestamp getOrderCreateDate() {
		return orderCreateDate;
	}
	public void setOrderCreateDate(Timestamp orderCreateDate) {
		this.orderCreateDate = orderCreateDate;
	}
	public Timestamp getUnloadCreateDate() {
		return unloadCreateDate;
	}
	public void setUnloadCreateDate(Timestamp unloadCreateDate) {
		this.unloadCreateDate = unloadCreateDate;
	}
	public Timestamp getUnloadDisDate() {
		return unloadDisDate;
	}
	public void setUnloadDisDate(Timestamp unloadDisDate) {
		this.unloadDisDate = unloadDisDate;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Orders(Integer id, Integer user_id, Integer park_id, String plate_num, Timestamp orderCreateDate,
			Timestamp unloadCreateDate, Timestamp unloadDisDate, Double total) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.park_id = park_id;
		this.plate_num = plate_num;
		this.orderCreateDate = orderCreateDate;
		this.unloadCreateDate = unloadCreateDate;
		this.unloadDisDate = unloadDisDate;
		this.total = total;
	}
	public Orders() {
		super();	// TODO Auto-generated constructor stub
	}
	

}

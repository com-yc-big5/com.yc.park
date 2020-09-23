package com.yc.tc.tingche.bean;

import java.sql.Timestamp;

public class orders {
	private Integer id;
	private Integer user_id; 
	private Integer park_id;
	private Timestamp createDate;
	private Integer status;
	private double total;
	private String  code;
	
	public orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public orders(Integer id, Integer user_id, Integer park_id, Timestamp createDate, Integer status, double total,
			String code) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.park_id = park_id;
		this.createDate = createDate;
		this.status = status;
		this.total = total;
		this.code = code;
	}
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
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	

}

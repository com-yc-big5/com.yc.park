package com.yc.tc.tingche.bean;

import java.sql.Timestamp;


public class orders {
	private Integer id;
	private Integer user_id; 
	private Integer park_id;
	private Integer plate_id;
	private Timestamp o_createDate;
	private Timestamp u_createDate;
	private Timestamp u_disDate;
	private double total;
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
	public Integer getPlate_id() {
		return plate_id;
	}
	public void setPlate_id(Integer plate_id) {
		this.plate_id = plate_id;
	}
	public Timestamp getO_createDate() {
		return o_createDate;
	}
	public void setO_createDate(Timestamp o_createDate) {
		this.o_createDate = o_createDate;
	}
	public Timestamp getU_createDate() {
		return u_createDate;
	}
	public void setU_createDate(Timestamp u_createDate) {
		this.u_createDate = u_createDate;
	}
	public Timestamp getU_disDate() {
		return u_disDate;
	}
	public void setU_disDate(Timestamp u_disDate) {
		this.u_disDate = u_disDate;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public orders(Integer id, Integer user_id, Integer park_id, Integer plate_id, Timestamp o_createDate,
			Timestamp u_createDate, Timestamp u_disDate, double total) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.park_id = park_id;
		this.plate_id = plate_id;
		this.o_createDate = o_createDate;
		this.u_createDate = u_createDate;
		this.u_disDate = u_disDate;
		this.total = total;
	}
	public orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

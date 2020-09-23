package com.yc.tc.tingche.bean;

import java.sql.Timestamp;


public class unload {
	private Integer id;
	private Integer order_id;
	private Timestamp craeteDate;
	private Timestamp disDate;
	
	public unload() {
		super();
		// TODO Auto-generated constructor stub
	}
	public unload(Integer id, Integer order_id, Timestamp craeteDate, Timestamp disDate) {
		super();
		this.id = id;
		this.order_id = order_id;
		this.craeteDate = craeteDate;
		this.disDate = disDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Timestamp getCraeteDate() {
		return craeteDate;
	}
	public void setCraeteDate(Timestamp craeteDate) {
		this.craeteDate = craeteDate;
	}
	public Timestamp getDisDate() {
		return disDate;
	}
	public void setDisDate(Timestamp disDate) {
		this.disDate = disDate;
	}
	
	

}

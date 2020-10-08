package com.yc.tc.tingche.bean;

import java.sql.Timestamp;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


public class User implements java.io.Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	@NotEmpty(message="用户名不能为空")
	private String name;
	@NotEmpty(message="密码不能为空")
	private String password;
	@NotEmpty(message="手机不能为空")
	private String phone;
	private String plate_num;
	private Integer stauts;
	private Timestamp createDate;
	private double money;
	private String  head;
	@Email(message = "邮箱格式错误")
	private String email;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, String password, String phone, String plate_num, Integer stauts,
			Timestamp createDate, double money, String head, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.plate_num = plate_num;
		this.stauts = stauts;
		this.createDate = createDate;
		this.money = money;
		this.head = head;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPlate_num() {
		return plate_num;
	}
	public void setPlate_num(String plate_num) {
		this.plate_num = plate_num;
	}
	public Integer getStauts() {
		return stauts;
	}
	public void setStauts(Integer stauts) {
		this.stauts = stauts;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

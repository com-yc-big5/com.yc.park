package com.yc.tc.tingche.bean;


public class Result<T> implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code;
	private String msg;
	private   T data;
	
	
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(int code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	public Result(String msg,int code,  T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	public Result(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	
	}
	public Result( String msg, T data) {
		super();
		
		this.msg = msg;
		this.data = data;
	}
	public Result(int code, T data) {
		super();
		this.code = code;
		
		this.data = data;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
	


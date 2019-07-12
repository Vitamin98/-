package com.bw.entity;

import java.util.Date;

public class User {
	private Integer uid;
	private String uname;
	private double price;
	private Date udate;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getUdate() {
		return udate;
	}
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", price=" + price + ", udate=" + udate + "]";
	}
	
	
}

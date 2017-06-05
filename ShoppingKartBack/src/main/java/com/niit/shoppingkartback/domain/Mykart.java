package com.niit.shoppingkartback.domain;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.springframework.stereotype.Component;

@Entity 
@Component
@Table(name="Mykart")
public class Mykart {
	@Id
	@GeneratedValue	
	private int kartid;
	private String username;
    private String email;
	private String status;
	private String productname;
	private String productid;
	private Date  date;
	private int price;
	private int days;
    private int sid;
    private int quantity;
	private int total;
	
	public int getKartid() {
		return kartid;
	}
	public void setKartid(int kartid) {
		this.kartid = kartid;
	}
	
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date  getDate() {
		return date;
	}
	public void setDate(Date  date) {
		this.date = date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	
	}

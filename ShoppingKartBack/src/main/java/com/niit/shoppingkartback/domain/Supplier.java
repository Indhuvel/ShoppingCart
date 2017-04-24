package com.niit.shoppingkartback.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Component 
@Table( name="supplier" )
public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
    private String sname;
	private String sdescription;
	private String address;
	private String email;
	private String contact;
	private String citycode;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSName() {
		return sname;
	}
	public void setSName(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSDescription() {
		return sdescription;
	}
	public void setSDescription(String description) {
		this.sdescription = description;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	
}

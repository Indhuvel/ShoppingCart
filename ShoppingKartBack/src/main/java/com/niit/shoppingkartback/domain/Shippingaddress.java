package com.niit.shoppingkartback.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity 
@Component
@Table( name="shippingaddress" )
public class Shippingaddress {
	    @Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	    private String sid;
	    private String username;
		private String email;
		private String contact;
		private String address;
		private int citycode;
		public String getSid() {
			return sid;
		}
		public void setSid(String sid) {
			this.sid = sid;
		}
		
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getCitycode() {
			return citycode;
		}
		public void setCitycode(int citycode) {
			this.citycode = citycode;
		}

}

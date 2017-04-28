package com.niit.shoppingkartback.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Component 
@Table( name="product" )
public class Product implements Serializable  {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
    private String productname;
    
    @Column(name="description")
    private String description;
    private String price;
	private int stock;
	
	
	private String category_id;
	private String supplier_id;

	@ManyToOne
	@JoinColumn(name="category_id",updatable=false,insertable=false,nullable=false)
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="supplier_id",updatable=false,insertable=false,nullable=false)
	private Category supplier;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
    
}

package com.niit.shoppingkartback.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name ="category")
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	
	private String categoryname;
	private String categorydescription;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getCategorydescription() {
		return categorydescription;
	}
	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
/*private Set<Product> products;

 @OneToMany(mappedBy="category",fetch=FetchType.EAGER)
 public Set<Product> getProducts()
 { return products;
 }
 public void setProducts(Set<Product> products){
	this.products=products;
 }*/

	
}

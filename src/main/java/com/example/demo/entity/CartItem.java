package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cartitems")
public class CartItem {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @ManyToOne
	    @JoinColumn(name = "user_id", nullable = false)
	    private Users user;

	    @ManyToOne
	    @JoinColumn(name = "product_id", nullable = false)
	    private Products product;

	    @Column
	    private int quantity;

	    public CartItem() {
	    }

	    public CartItem(Users user, Products product, int quantity) {
	        this.user = user;
	        this.product = product;
	        this.quantity = quantity;
	    }

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public Users getUser() {
	        return user;
	    }

	    public void setUser(Users user) {
	        this.user = user;
	    }

	    public Products getProduct() {
	        return product;
	    }

	    public void setProduct(Products product) {
	        this.product = product;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

		public CartItem(Integer id, Users user, Products product, int quantity) {
			super();
			this.id = id;
			this.user = user;
			this.product = product;
			this.quantity = quantity;
		}

		
		
	   
	    
	    
	
}

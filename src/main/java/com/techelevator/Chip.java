package com.techelevator;

import java.math.BigDecimal;

public class Chip extends Item {
    	
	
	public Chip( String productName,Double price) {
	    super(productName, price);
	    
	    }
	public String getSound() {
		return "Crunch Crunch, Yum!!";
	}
	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return this.productName;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}  
  
	}

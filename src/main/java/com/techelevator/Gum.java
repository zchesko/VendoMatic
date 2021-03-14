package com.techelevator;

import java.math.BigDecimal;

public class Gum extends Item {

	public Gum(String productName, Double price) {
		super(productName, price);
		// TODO Auto-generated constructor stub
	}

	public String getSound() {
		return "Chew Chew, Yum!!";
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

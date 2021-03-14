package com.techelevator;

import java.math.BigDecimal;

public class Drinks extends Item{

	public Drinks(String productName, Double price) {
		super(productName, price);
		// TODO Auto-generated constructor stub
	}

	public String getSound() {
		return "Glug Glug, Yum!!";
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

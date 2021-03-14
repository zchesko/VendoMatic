package com.techelevator;

import java.math.BigDecimal;

public class Candy extends Item {

	public Candy(String productName, Double price) {
		super(productName, price);
	}

	public String getSound() {
		return "Munch Munch, Yum!!";
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

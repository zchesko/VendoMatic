package com.techelevator;

import java.math.BigDecimal;

public abstract class Item implements Dispensable {
	public String productName;
	public double price;
    
	public Item(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}
	
	public abstract String getProductName();
	public abstract double getPrice();
	public abstract String getSound();
	
}
	

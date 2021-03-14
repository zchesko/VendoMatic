package com.techelevator;

import org.junit.Test;
import org.junit.Assert;

public class CandyTest {

	
	@Test
	public void getSound_returns_the_correct_sound() {
		
		String sound = "Munch Munch, Yum!!";
		Candy testCandy = new Candy(sound, 0.75);
		
		Assert.assertEquals("Munch Munch, Yum!", testCandy.getSound());
		
	}
	
	@Test
	public void getProductName_returns_the_correct_product_name() {
		
		String productName = "Crunch Bar";
		Candy testCandy = new Candy(productName, 0.75);
		Assert.assertEquals(productName, testCandy.getProductName());
		
	}
	
	@Test
	public void getPrice_returns_the_correct_price() {
		
		double productPrice = 0.75;
		Candy testCandy = new Candy("Crunch Bar", 0.75);	
		Assert.assertEquals(productPrice, testCandy.getPrice(), 0);
		
	}
}

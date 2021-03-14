package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class GumTest {
	
	@Test
	public void getSound_returns_the_correct_sound() {
		
		String sound = "Chew Chew, Yum!!";
		Gum testGum = new Gum(sound, 0.75);
		
		Assert.assertEquals("Chew Chew, Yum!!", testGum.getSound());
		
	}
	
	@Test
	public void getProductName_returns_the_correct_product_name() {
		
		String productName = "Juicy Fruit";
		Gum testGum = new Gum(productName, 0.75);
		Assert.assertEquals(productName, testGum.getProductName());
		
	}
	
	@Test
	public void getPrice_returns_the_correct_price() {
		
		double productPrice = 0.75;
		Gum testGum = new Gum("Juicy Fruit", 0.75);	
		Assert.assertEquals(productPrice, testGum.getPrice(), 0);
		
	}
}

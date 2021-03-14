package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class ChipTest {

	
	@Test
	public void getSound_returns_the_correct_sound() {
		
		String sound = "Crunch Crunch, Yum!";
		Chip testChip = new Chip(sound, 2.75);
		
		Assert.assertEquals("Crunch Crunch, Yum!!", testChip.getSound());
		
	}
	
	@Test
	public void getProductName_returns_product_name() {
		
		String productName = "Potato Crisps";
		Chip testChip = new Chip(productName, 2.75);
		Assert.assertEquals(productName, testChip.getProductName());	
		
	}
	
	
	@Test
	public void getPrice_returns_the_correct_price() {
		
		double productPrice = 2.75;
		Chip testChip = new Chip("Potato Crisps", 2.75);
		Assert.assertEquals(productPrice, testChip.getPrice(), 0);
		
	}
}

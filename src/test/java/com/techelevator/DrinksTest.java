package com.techelevator;


import org.junit.*;



public class DrinksTest {
    
    @SuppressWarnings("deprecation")
    @Test
    public void getSound_returns_the_right_sound() {
	String sound = "Glug Glug, Yum!!";
	Drinks testDrink = new Drinks(sound, 1.5);
	
	Assert.assertEquals("Glug Glug, Yum!!", testDrink.getSound());
	 }
    
    @Test
    public void get_product_name_works() {
	String productName = "Dr. Salt";
	Drinks testDrink = new Drinks(productName, 1.5);
	Assert.assertEquals("Dr. Salt", testDrink.getProductName());
	
    }
    @Test
    public void get_product_price() {
	double price = 1.5;
	Drinks testDrink = new Drinks("Dr. Salt", 1.5 );
	Assert.assertEquals(price, testDrink.getPrice(), 0);
    }
}

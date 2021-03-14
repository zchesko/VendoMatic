package com.techelevator;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Stack;

import org.junit.*;

public class InventoryTest {

    @Test
    public void key_exists() throws FileNotFoundException {
	Inventory inv = new Inventory();
	
	Map<String, Stack<Item>> items = inv.createProducts();
	
	boolean tester = items.containsKey("A1");
	Assert.assertTrue(tester); 
    }
    
    @Test
    public void returns_potato_crisp_when_we_ask() throws FileNotFoundException {

    	Inventory inv = new Inventory();
    	
    	Map<String, Stack<Item>> items = inv.createProducts();
    	
    	String snack = items.get("A1").peek().getProductName();  
    	
    	Assert.assertEquals("Potato Crisps", snack);
    }
    @Test
    public void returns_cowtales_when_we_ask() throws FileNotFoundException{
	Inventory inv = new Inventory();
    	
    	Map<String, Stack<Item>> items = inv.getAndPrintProducts();
    	
    	String snack = items.get("B2").peek().getProductName();
    	
    	Assert.assertEquals("Cowtales", snack);
	
    }
    
}




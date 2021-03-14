package com.techelevator;

import java.util.ArrayList;



import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal; 

public class Inventory {
	  
	private Map<String, Stack<Item>> products = new LinkedHashMap<>();
	private Map<String, Integer> productInventory = new LinkedHashMap<>();
	private String slotNumber;

	public Inventory() throws FileNotFoundException {
		 File vendingMachine = new File("vendingmachine.csv");
		    
		 try (Scanner fileScanner = new Scanner(vendingMachine)) {
			while (fileScanner.hasNextLine()) {
				String lineByLine = fileScanner.nextLine();
				String [] product = lineByLine.split("\\|");
				String slotNumber = product[0];
				String productName = product[1];
				Double price = Double.parseDouble(product[2]);
				String dispensableType = product[3];
				Stack<Item> stack = new Stack<>();
				products.put(slotNumber, stack);
			
					for (int i = 0; i < 6; i++) {
						if (dispensableType.equals("Chip")) {
							Chip newItem = new Chip(productName, price);
							products.get(slotNumber).push(newItem);
							//productInventory.put(slotNumber, 5);
					  	} else if (dispensableType.equals("Candy")) {
							Candy newItem = new Candy (productName, price);
							products.get(slotNumber).push(newItem);
							//productInventory.put(slotNumber, 5);
						} else if (dispensableType.equals("Drink")) {
							Drinks newItem = new Drinks(productName, price);
							products.get(slotNumber).push(newItem);
							//productInventory.put(slotNumber, 5);
						} else {
							Gum newItem = new Gum(productName, price);
							products.get(slotNumber).push(newItem);
							//productInventory.put(slotNumber, 5);
						}
					}
				}
			
		 }
		 }
		
		
		
	public Map<String, Stack<Item>> getAndPrintProducts() {
	    Map<String, Stack<Item>> x = products;
	     for (String values : x.keySet()) {
			x.get(values);
	 		System.out.println(values + ": " + x.get(values).peek().getProductName() + " | " + "$" + x.get(values).peek().getPrice() + " | " + "Quantity remaining: " + (x.get(values).size()-1));
	     
		}  return x;
	}
	public Map<String, Stack<Item>> createProducts(){
	    return products;
	}
	
	 }

	




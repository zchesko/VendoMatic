package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;  
import java.util.Scanner;
import java.util.Stack;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class MainMenu {
	 

	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String [] args) throws IOException {
	    //double balance = 0.0;
	    DecimalFormat df = new DecimalFormat("#.##");
	    
		
	    Inventory theInventory = new Inventory();
	    VendingMachine myVendingMachine = new VendingMachine();
	    Double extraDollars = 0.0;
	    String userSelection = "";  
	    double theCurrentBalance = 0.0;  
	    List<Double> feedMoney = new ArrayList<>();
	    double feedMoneyBalance = 0.0;
	    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	    
	    
		 
		File logFile = new File("Log.txt");
		logFile.createNewFile();  
		FileWriter fileWriter = new FileWriter(logFile, true);
		  
		System.out.println("************************************");
		System.out.println("************************************");
		System.out.println("** WELCOME TO THE VENDO-MATIC 800 **");
		System.out.println("************************************");
		System.out.println("*******************************+****");
		System.out.println();
		System.out.println();
		System.out.println("Please select an option below:");
		System.out.println();
		
		System.out.println("Hit any key to begin");
		Scanner userInput = new Scanner(System.in);
		String initialValue = userInput.nextLine();
		while (!initialValue.isEmpty()) {
		    
		
		
		myVendingMachine.displayMainMenu();   
		
		
		String mainMenuSelection = userInput.nextLine();
		
			if (mainMenuSelection.equals("1")) {			
				
			while (mainMenuSelection.equals("1")) {
				myVendingMachine.displayMainMenu();
				theInventory.getAndPrintProducts();
			
			
			System.out.println("Would you like to continue purchasing an item? Y/N");
			String answer = userInput.nextLine();
			if(answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
			    initialValue = "1";
			    break;
			} else {break;
			}  
			}
			    
			} else if (mainMenuSelection.equals("2")) {
				while(mainMenuSelection.equals("2")) {
					myVendingMachine.displaySubMenu();
					String subMenuSelection = userInput.nextLine();
 
				if (subMenuSelection.equals("1")) {	


					System.out.println("Please enter a valid dollar amount (e.g. 1,5,10)");
					myVendingMachine.feedMoney();
					System.out.println("Would you like to feed more money? Y/N");
					

 
//					String yesOrNoMoreMoney; 
//	  				 				
//					 do {		     						
//						System.out.println("Please enter a valid dolar amount (e.g. 1,5,10)");
//						String dollarAmount = userInput.nextLine();
//						
//						extraDollars = Double.parseDouble(dollarAmount);
//						//feedMoney.add(extraDollars);
//						
//						balance += extraDollars; 
//						
//						System.out.println("Your balance is: " + "$" + balance);
//						
//						try(PrintWriter writer = new PrintWriter(fileWriter)){
//							
//							writer.print(timeStamp + " > " + "FEED MONEY: $" + extraDollars + " > " + "Balance: $" + balance + " > ");
//							
//						}
//						 
						
					myVendingMachine.getBalance();

				}
			else if (subMenuSelection.equals("2")) {
				
				while (subMenuSelection.equals("2")) {
					
					Map<String, Stack<Item>> x = theInventory.getAndPrintProducts();
						
						System.out.println();
						System.out.println();
						
						System.out.println("Please select and item to dispense (e.g. B2) > ");
						userSelection = userInput.nextLine();
						
			  			if (!x.keySet().contains(userSelection) || x.get(userSelection).size() == 1) {
							
							System.out.println("Sorry, this product does not exist or is out of stock. Please select an option from the menu.");
							subMenuSelection = "2";
					
						}
						
						else if ((x.keySet().contains(userSelection) && x.get(userSelection).size() > 0)) {
							if(x.get(userSelection).peek().getPrice() >= myVendingMachine.getBalance() || x.get(userSelection).peek().getPrice() > theCurrentBalance ) {
							    System.out.println("Please enter more $$$ if you wish to continue!");
							    subMenuSelection = "1";
							}
							if (x.get(userSelection).peek().getPrice() <= myVendingMachine.getBalance()) {
								x.get(userSelection).pop();
								theCurrentBalance = myVendingMachine.getBalance() - x.get(userSelection).peek().getPrice();
								  //balance -= x.get(userSelection).peek().getPrice();
								if (userSelection.contains("A")) {
									System.out.println(x.get(userSelection).peek().getProductName() + " $" + x.get(userSelection).peek().getPrice() + " " + x.get(userSelection).peek().getSound() );	
									System.out.println("Your current balance is: $" + theCurrentBalance);									
									break;
								} else if (userSelection.contains("B")) {
									System.out.println(x.get(userSelection).peek().getProductName() + " $" + x.get(userSelection).peek().getPrice() + " " + x.get(userSelection).peek().getSound() );	
									System.out.println("Your current balance is: $" + theCurrentBalance);									
									break;
								} else if (userSelection.contains("C")) {
									System.out.println(x.get(userSelection).peek().getProductName() + " $" + x.get(userSelection).peek().getPrice() + " " + x.get(userSelection).peek().getSound() );	
									System.out.println("Your current balance is: $" + theCurrentBalance);									
									break;
								} else {
									System.out.println(x.get(userSelection).peek().getProductName() + " $" + x.get(userSelection).peek().getPrice() + " " + x.get(userSelection).peek().getSound() );	
									System.out.println("Your current balance is: $" + theCurrentBalance);
									break;
								}								
							}
						}						
					}	
				} 
				 
				else if (subMenuSelection.equals("3")) {
					myVendingMachine.findMinCoins(theCurrentBalance);
					double changeGiven = theCurrentBalance - theCurrentBalance;
					
					Map<String, Stack<Item>> x = theInventory.createProducts();
					
					for (String values : x.keySet()) {
						x.get(values);
					
					}
					     
					     
					 
					 FileWriter fileWriter2 = new FileWriter(logFile, true);
					try(PrintWriter writer2 = new PrintWriter(fileWriter2)){
						
						writer2.println(timeStamp + " > " + x.get(userSelection).peek().getProductName() + " Price: $" + x.get(userSelection).peek().getPrice() + " " + userSelection + " > " + timeStamp + " > CHANGE GIVEN: $" + theCurrentBalance +  "  Vending Machine Ending Balance: $" + changeGiven);						
					}
					
					mainMenuSelection = "0";
				}
					
				} 
			}
			
				else if (mainMenuSelection.equals("3")){
					break;
					}
				
			
			}  
		}
}




package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Vector;
import java.util.Scanner;

public class VendingMachine {
	
	public double balance;
	public static double [] coins = new double[] {.05, .10, .25};
	public static int c = coins.length;
	protected ArrayList<Double> ans = new ArrayList<>();
	
	
    public static double[] getCoins() {
	    return coins;
	}

    public ArrayList<Double> findMinCoins(double v) {
	
	for (int i = c - 1; i>=0; i--) {
	    while(v>= coins[i]) {
		v -= coins[i];
		 ans.add(coins[i]); 
		 
	    } 
	    }	 
	    for (int i =0; i<ans.size(); i++) {
		
		    System.out.print(" $" + ans.get(i));
		    System.out.println();
	}
	return ans;
	    }
 
    public void displaySubMenu() {
    	System.out.println("(1) Feed Money >");
		System.out.println("(2) Select Product >");
		System.out.println("(3) Finish Transaction >");
		
    }
    public void displayMainMenu() {  
	System.out.println("(1) Display Vending Machine Items >");
	System.out.println("(2) Purchase >");
	System.out.println("(3) Exit >");
	
    }
    
    @SuppressWarnings("resource")
    public void feedMoney() throws IOException {
    
    	File logFile = new File("Log.txt");
		logFile.createNewFile();  
		FileWriter fileWriter = new FileWriter(logFile, true);
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		String yesOrNoMoreMoney;
		double balance = 0.0;
		
		do {
    	Scanner userInput = new Scanner(System.in);;
    	String userDollarAmount = userInput.nextLine();
    	Double moneyFed = Double.parseDouble(userDollarAmount);
    	this.balance += moneyFed;
    	System.out.println("Your balance is: $" + this.balance);
    	
	    	try(PrintWriter writer = new PrintWriter(fileWriter)){
				
				writer.print(timeStamp + " > " + "FEED MONEY: $" + moneyFed + " $" + this.balance);
				
			}
	    	System.out.println("Would you like to feed more money? Y/N");
			yesOrNoMoreMoney = userInput.nextLine();
			
		} 
		while (yesOrNoMoreMoney.equalsIgnoreCase("Y"));
    }  
    
     	
    public double getBalance() {
    	
    	return balance;
    }
    
    }
	





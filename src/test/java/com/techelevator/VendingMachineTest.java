package com.techelevator;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.*;

public class VendingMachineTest {
    @Test
    public void coin_method_works() {
	VendingMachine testMachine = new VendingMachine();
	double v = 1.30;
	
	ArrayList<Double> test = testMachine.findMinCoins(v);
	 int n = test.size();
	 
	 Assert.assertEquals(6, n);
    }
	 
    @Test
    public void sum_of_first_5_coins() {
	
	VendingMachine testMachine = new VendingMachine();
	double v = 1.30;

	
	ArrayList<Double> test = testMachine.findMinCoins(v);
	double count = 0;
	for(int i = 0; i < 5; i++) {  
	    count += test.get(i);
	    }
	Assert.assertEquals(count, 1.25, 0);
    }
    @Test
    public void get_coins_works() {
	VendingMachine testMachine = new VendingMachine();
	
	double[] n = VendingMachine.getCoins();
	
	 double num = n[0];
	 
	 Assert.assertEquals(.05, num, 0);
	
    }
    }
  
	
	
	
	
	
	
	
	
	
    




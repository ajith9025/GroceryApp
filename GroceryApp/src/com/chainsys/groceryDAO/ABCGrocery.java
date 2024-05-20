package com.chainsys.groceryDAO;

import java.sql.SQLException;

public class ABCGrocery extends Grocery implements GroceryDetails {

	
	@Override
	public String addToWelcome() {
		// TODO Auto-generated method stub
		System.out.println(" Welcome to all the user of the GroceryApp ");
		return null;
	}
	
	
	@Override
	public String addToAddress() {
		// TODO Auto-generated method stub
		System.out.println("1/155,south street,madurai(Tk),madurai(Dt),621204");
		return null;
	}

	@Override
	public String customerName() {
		// TODO Auto-generated method stub
		System.out.println("HARI D");
		return null;
	}


	@Override
	public String review() {
		// TODO Auto-generated method stub
		System.out.println("This product very nice and good");
		return null;
	}


//	@Override
	//public String location() {
	//	// TODO Auto-generated method stub
	//	System.out.println("trichy");
	//	return null;
	//}


	@Override
	public String thanksInformation() {
		// TODO Auto-generated method stub
		System.out.println("Thank you for using this GroceryApp");
		return null;
	}

}




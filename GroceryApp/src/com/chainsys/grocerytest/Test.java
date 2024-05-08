package com.chainsys.grocerytest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.chainsys.groceryDAO.ABCGrocery;
import com.chainsys.groceryDAO.GroceryApp;
import com.chainsys.util.Crud;

public class Test {

	private static String signup;
	private static String login;
	private static String userName;

	@SuppressWarnings({ "static-access", "unused" })

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		GroceryApp groceryapp = new GroceryApp();
       	ABCGrocery grocery = new ABCGrocery();
		grocery.addToWelcome();
		System.out.println();
		System.out.println("   select the option(1 to 2) ");
		System.out.println();
		while (true) {
			System.out.println("1)----------Signup  page----------\n2)----------Login page---------");
			int n = sc.nextInt();
			if (n == 1) {
				System.out.println("Enter the username:");
				String c = sc.next();
				System.out.println("Enter the password:");
				int d = sc.nextInt();
				Crud.registerUser(c, d);

			}

			if (n == 2) {
				while (true) {
					System.out.println("Enter the user name:");
					String userName = sc.next();
					if (userName.matches("[a-zA-Z]+[0-9]{2,15}")) {
						System.out.println("valid");

						System.out.println("Enter the password:");
						int password = sc.nextInt();

						Crud.login(userName, password);
					
						System.out.println();
                        System.out.println("1.HOME");
                        System.out.println("2.ABOUT US");
                        System.out.println("3.CONTANT US");
                        System.out.println("4.ADD TO CART");
                        System.out.println("5.ORDER LIST");
                        System.out.println();
                        int option=sc.nextInt();
                       // int choice = sc.nextInt();

						switch (option) {
						case 1:
					        System.out.println("HOME");
							GroceryApp.HOME();
							break;
						case 2:
							System.out.println("ABOUT US");
							GroceryApp.ABOUT();
							break;
						case 3:
							System.out.println("CONTACT US");
							GroceryApp.CONTACT();
							break;
						case 4:
							System.out.println("ADD TO CART");
							GroceryApp.CART();
							break;
						case 5:
							System.out.println("ORDER LIST");
							GroceryApp.ORDER();
							break;
						}         
						System.out.println("Enter the items:");
						int items=sc.nextInt();
						System.out.println("Enter the productId:");
						int id=sc.nextInt();
						System.out.println("Enter the productName:");
						String name=sc.next();
						System.out.println("Enter the qty:");
						int qty=sc.nextInt();
						System.out.println("Enter the price:");
						int price=sc.nextInt();
						System.out.println("Enter the totalPrice:");
						int total=sc.nextInt();
						System.out.println("Enter the mobile number:");
						String mobile=sc.next();
						System.out.println("Enter the location");
						String location=sc.next();
						Crud.insert(items, id, name, qty, price, total,mobile,location);
						//double items = 3;
		     			ArrayList<String> al = new ArrayList<String>();
						al.add("select the product");
						al.add("1.snacks");
						al.add("2.vegatable");
						al.add("3.fruits");
						try {
							for (String product : al)
								System.out.println(product);
							System.out.println(al.get(5));
						} catch (IndexOutOfBoundsException e) {
							System.out.println(e.getMessage());
						}

						int choice = sc.nextInt();

						switch (choice) {
						case 1:
					        System.out.println("snacks");
							GroceryApp.snacks();
							break;
						case 2:
							System.out.println("vegetable");
							GroceryApp.vegetable();
							break;
						case 3:
							System.out.println("fruits");
							GroceryApp.fruits();
							break;

						}
					//	System.out.println("Enter the total qty:");
					// int qty = sc.nextInt();
						List<String> a = new ArrayList<String>();
						a.add("Select the payment mode");
						a.add("1.online cash");
						a.add("2.cash on delivery");
						try {
						for (String payment : a)
							System.out.println(payment);
						    System.out.println(a.get(5));
						}catch(IndexOutOfBoundsException e)
						{
							System.out.println(e.getMessage());
						}

						int paymentmode = sc.nextInt();
						switch (paymentmode) {
						case 1:
							System.out.println("online cash");
							break;

						case 2:
							System.out.println("cash on delivery");
							break;

						}
						System.out.println();
						ABCGrocery grocery1 = new ABCGrocery();
						grocery1.addToAddress();
						// grocery1.location();
						grocery1.customerName();
						grocery1.review();

						// groceryapp.purchase(userName);
						//groceryapp.purchase(items, qty, 10);
						//groceryapp.purchase(125);
						//int totalPrice = 0;
						//groceryapp.purchase(10, qty, totalPrice);

						break;

					} else {
						System.out.println("Invalid");

						userName = sc.next();

					}
					
				}
				

				break;
				}
			}
		System.out.println();
		ABCGrocery grocery1 = new ABCGrocery();
		grocery1.thanksInformation();
		sc.close();

	}
}













































































// Crud.insert(8,14, "snacks", 40, 400,4000);
// Crud.delete(6);
// Crud.insert(13, 200, "vegetable", 20, 300, 3000);
// Crud.update(2, 1, 10, 100, 10);

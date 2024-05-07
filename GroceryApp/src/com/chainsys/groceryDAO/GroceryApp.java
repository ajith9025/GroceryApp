package com.chainsys.groceryDAO;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GroceryApp {
    Scanner sc=new Scanner(System.in);
	public static void purchase(String userName) {
		System.out.println();
		if (userName.matches("[A-Za-z]+[0-9](2-15")) {
			System.out.println("valid ");
		} else
			System.out.println("Invalid");

	}
	public static void password(String passWord) {
		System.out.println();
		if (passWord.matches("[A-Za-z]+[0-9](2-15)")) {
			System.out.println("valid ");
		} else
			System.out.println("Invalid");

	}

	public static void purchase(double items, int qty, int price)

	{
		System.out.println();
		System.out.println("How many items: " + items + "  TotalQty: " + qty + " Price of Rs: " + price);
	}

	public static void purchase(int productId) {

		System.out.println("Product id: " + productId );

	}

	public static void purchase(int price, int qty, int totalPrice) {
		totalPrice = qty * price;
		System.out.println("totalPrice:" + totalPrice);
		if (totalPrice > price) {
			System.out.println("valid");
		} else
			System.out.println("Invalid");

	}

	public static void option() {
		Scanner sc = new Scanner(System.in);
		char option = sc.next().toLowerCase().charAt(0);

		switch (option) {
		case 'a':
			System.out.println("Home");
			break;
		case 'b':
			System.out.println("About us");
			break;
		case 'c':
			System.out.println("Contacts");
			break;
		case 'd':
			System.out.println("Products");
			break;
		}
	}

	public static void snacks() {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("a.bingo");
		System.out.println("b.biscuits");
		System.out.println("c.cholates");*/
		List<String> a1=new ArrayList<String>();
		a1.add("a.bingo");
		a1.add("b.biscuits");
		a1.add("c.cholates");
		try {
		for(String snacks:a1)
			System.out.println(snacks);
		    System.out.println(a1.get(5));
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//for(String snacks:a1)
			//System.out.println(snacks);
		char choice = sc.next().toLowerCase().charAt(0);

		switch (choice) {
		case 'a':
			System.out.println("bingo");
			break;
		case 'b':
			System.out.println("biscuits");
			break;
		case 'c':
			System.out.println("cholates");
			break;
		}
	}

	public static void vegetable() {
		Scanner sc = new Scanner(System.in);
	/*	System.out.println("a.potato");
		System.out.println("b.tomato");
		System.out.println("c.carrot");*/
		List<String> a1=new ArrayList<String>();
		a1.add("a.potato");
		a1.add("b.tomato");
		a1.add("c.carrot");
		try {
			for(String snacks:a1)
				System.out.println(snacks);
			    System.out.println(a1.get(5));
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		//for(String vegetable:a1)
			//System.out.println(vegetable);
		
		char choice = sc.next().toLowerCase().charAt(0);
		switch (choice) {
		case 'a':
			System.out.println("potato");
			break;
		case 'b':
			System.out.println("tomato");
			break;
		case 'c':
			System.out.println("carrot");
			break;
		}
	}

	public static void fruits() {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("a.mango");
		System.out.println("b.orange");
		System.out.println("c.apple");*/
		List<String> a1=new ArrayList<String>();
		a1.add("a.mango");
		a1.add("b.orange");
		a1.add("c.apple");
		try {
			for(String snacks:a1)
				System.out.println(snacks);
			    System.out.println(a1.get(5));
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		//for(String fruits:a1)
			//System.out.println(fruits);
		
		char choice = sc.next().toLowerCase().charAt(0);
		switch (choice) {
		case 'a':
			System.out.println("mango");
			break;
		case 'b':
			System.out.println("orange");
			break;
		case 'c':
			System.out.println("apple");
			break;
		}
	}

	public static void signup(String signup) {

		System.out.println("Signup successfully");
	}

	public static void login(String login)

	{
		System.out.println("Login successfully");
	}
	


}


package com.chainsys.groceryDAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.chainsys.util.Crud;

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
		}catch(IndexOutOfBoundsException e)
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
			}catch(IndexOutOfBoundsException e)
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
			}catch(IndexOutOfBoundsException e)
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
	
	public static void HOME() {
		Scanner sc = new Scanner(System.in);
	/*	System.out.println("a.potato");
		System.out.println("b.tomato");
		System.out.println("c.carrot");*/
		List<String> a1=new ArrayList<String>();
		a1.add("a)qwertyuiop");
		a1.add("b)trvxvvs");
		a1.add("c)mjaamn");
			for(String HOME:a1)
				System.out.println(HOME);
		
		char choice = sc.next().toLowerCase().charAt(0);
		switch (choice) {
		case 'a':
			System.out.println("qwertyuiop");
			break;
		case 'b':
			System.out.println("trvxvvs");
			break;
		case 'c':
			System.out.println("mjaamn");
			break;
		}
	}
	public static void ABOUT() {
		Scanner sc = new Scanner(System.in);
	/*	System.out.println("a.potato");
		System.out.println("b.tomato");
		System.out.println("c.carrot");*/
		List<String> a1=new ArrayList<String>();
		a1.add("a)Join the Community");
		a1.add("b)Where to Start");
		a1.add("c)Plans and Pricing");
			for(String ABOUT:a1)
				System.out.println(ABOUT);
		
		char choice = sc.next().toLowerCase().charAt(0);
		switch (choice) {
		case 'a':
			System.out.println("Join the Community");
			break;
		case 'b':
			System.out.println("Where to Start");
			break;
		case 'c':
			System.out.println("Plans and Pricing");
			break;
		}
	}
	public static void CONTACT() {
		Scanner sc = new Scanner(System.in);
	/*	System.out.println("a.potato");
		System.out.println("b.tomato");
		System.out.println("c.carrot");*/
		List<String> a1=new ArrayList<String>();
		a1.add("a)1234567890");
		a1.add("b)9277236822");
		a1.add("c)8765437833");
			for(String CONTACT:a1)
				System.out.println(CONTACT);
		
		char choice = sc.next().toLowerCase().charAt(0);
		switch (choice) {
		case 'a':
			System.out.println("1234567890");
			break;
		case 'b':
			System.out.println("9277236822");
			break;
		case 'c':
			System.out.println("8765437833");
			break;
		}
	}
	public static void CART() {
		Scanner sc = new Scanner(System.in);
	/*	System.out.println("a.potato");
		System.out.println("b.tomato");
		System.out.println("c.carrot");*/
		List<String> a1=new ArrayList<String>();
		a1.add("a)biscuits");
		a1.add("b)potato");
		a1.add("c)mango");
			for(String CART:a1)
				System.out.println(CART);
		
		char choice = sc.next().toLowerCase().charAt(0);
		switch (choice) {
		case 'a':
			System.out.println("add to cart:biscuits");
			break;
		case 'b':
			System.out.println("add to cart:potato");
			break;
		case 'c':
			System.out.println("add to cart:mango");
			break;
		}
	}
	
	public static void ORDER()  {
		Scanner sc = new Scanner(System.in);
	/*	System.out.println("a.potato");
		System.out.println("b.tomato");
		System.out.println("c.carrot");*/
		List<String> a1=new ArrayList<String>();
		a1.add("a)snacks");
		a1.add("b)vegetable");
		a1.add("c)fruits");
			for(String OREDR:a1)
				System.out.println(OREDR);
		
		char choice = sc.next().toLowerCase().charAt(0);
		switch (choice) {
		case 'a':
			System.out.println("snacks");
			break;
		case 'b':
			System.out.println("vegetable");
			break;
		case 'c':
			System.out.println("fruits");
			break;
		}
	}
}


package com.chainsys.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud {
	
	static Jdbc db=new Jdbc();
	public static void insert(int items,int productId, String productName, int qty,
			int price, int totalPrice) throws ClassNotFoundException, SQLException {
		
		Connection connection = db.getConnection();
		String query = "insert into product values(?,?,?,?,?,?)";
		PreparedStatement prepare = connection.prepareStatement(query);
		prepare.setInt(1, items);
		prepare.setInt(2, productId);
		prepare.setString(3, productName);
		prepare.setInt(4, qty);
		prepare.setInt(5, price);
		prepare.setInt(6, totalPrice);
		int rows = prepare.executeUpdate();
		System.out.println("added:" + rows);

	}

	public static void delete(int items) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = db.getConnection();
		String query = "delete from product where items=3";
		PreparedStatement prepare =connection.prepareStatement(query);
		System.out.println("deleted successfully");
		prepare.execute();
		connection.close();
	}
	
	public static void  update(String productName) throws ClassNotFoundException, SQLException {
		Connection connection =db.getConnection();
		String query = "update product set product_name= 'snacks' where items=11";
		PreparedStatement prepare =connection.prepareStatement(query);
		System.out.println("updated successfully");
		prepare.execute();
		connection.close();
	}
	
	
	
	public static void registerUser( String username, int password )
            throws ClassNotFoundException, SQLException {
        Connection connection =db.getConnection();
        String selectQuery = "select username,password from user where username= ? ";
        PreparedStatement prepare = connection.prepareStatement(selectQuery);
        prepare.setString(1, username);
        ResultSet rs = prepare.executeQuery();

        if (!rs.next()) {
            String insertQuery = "insert into user (username, password) values ( ?, ?)";
            PreparedStatement insert = connection.prepareStatement(insertQuery);
            insert.setString(1, username);
            insert.setInt(2, password);
            insert.executeUpdate();
            System.out.println("Username  registered successfully.");
        } else {
            System.out.println("Username already exists .");
        }

	}  
	public static void login( String username, int password )
            throws ClassNotFoundException, SQLException {
        Connection connection =db.getConnection();
        String selectQuery = "select username,password from user where username= ? ";
        PreparedStatement prepare = connection.prepareStatement(selectQuery);
        prepare.setString(1, username);
        ResultSet rs = prepare.executeQuery();

        if (!rs.next()) {
            String insertQuery = "insert into login(username, password) values ( ?, ?)";
            PreparedStatement insert = connection.prepareStatement(insertQuery);
            insert.setString(1, username);
            insert.setInt(2, password);
            insert.executeUpdate();
            System.out.println("Login successfully.");
        } else {
            System.out.println("Login already exists .");
        }

	}  
      	

}

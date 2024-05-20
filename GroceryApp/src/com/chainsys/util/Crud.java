package com.chainsys.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.model.Product;

public class Crud {
	
	static Jdbc db=new Jdbc();
	public static void insert(int items,int productId, String productName, int qty,
			int price, int totalPrice, String MobileNumber,String location) throws ClassNotFoundException, SQLException {
		
		Connection connection = db.getConnection();
		String query = "insert into product values(?,?,?,?,?,?,?,?)";
		PreparedStatement prepare = connection.prepareStatement(query);
		prepare.setInt(1, items);
		prepare.setInt(2, productId);
		prepare.setString(3, productName);
		prepare.setInt(4, qty);
		prepare.setInt(5, price);
		prepare.setInt(6, totalPrice);
		prepare.setString(7,MobileNumber);
		prepare.setString(8, location);
		int rows = prepare.executeUpdate();
		System.out.println("added:" + rows);

	}
	
	/*public static void ProductList( Product items) throws ClassNotFoundException, SQLException
	{
		int temp=0;
		Connection connection=db.getConnection();
		String query="select productId,ProductName,qty,price,totalPrice,MobileNumber,location where items";
		PreparedStatement prepare=connection.prepareStatement(query);
		prepare .setInt(1, (int) items.getItems());
        ResultSet rs = prepare.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3)+"   "+rs.getInt(4)+"  "+rs.getInt(5)+"   "+rs.getString(6)+" "+rs.getString(7));
        }
   }
		
		
	private static int items() {
		// TODO Auto-generated method stub
		return 0;
	}*/


	

	public static void delete(int items) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = db.getConnection();
		String query = "delete from product where items= ?";
		PreparedStatement prepare =connection.prepareStatement(query);
		prepare.setInt(1, items);
		System.out.println("deleted successfully");
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
	public static void login( String username, String password )
            throws ClassNotFoundException, SQLException {
        Connection connection =db.getConnection();
        String selectQuery = "select username,password from login where username= ? ";
        PreparedStatement prepare = connection.prepareStatement(selectQuery);
        prepare.setString(1, username);
        ResultSet rs = prepare.executeQuery();

        if (!rs.next()) {
            String insertQuery = "insert into login(username, password) values ( ?, ?)";
            PreparedStatement insert = connection.prepareStatement(insertQuery);
            insert.setString(1, username);
            insert.setString(2, password);
            insert.executeUpdate();
            System.out.println("Login successfully.");
        } else {
            System.out.println("Login already exists .");
        }

	}

	public static void update(int items,int productId) throws SQLException, ClassNotFoundException {

		Connection connection = db.getConnection();
		String query = "update product set product_id = ? where items= ?";
		PreparedStatement prepare = connection.prepareStatement(query);
		prepare.setInt(1, productId);
		prepare.setInt(2, items);
		prepare.executeUpdate();
		connection.close();
		
	}
	
}


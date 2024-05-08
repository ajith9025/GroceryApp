package com.chainsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Jdbc {



	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/day2";
		String userName = "root";
		String password = "ajith123";
		String query = "select * from product";
		Connection connection = DriverManager.getConnection(url, userName, password);
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		//ResultSetMetaData rsmd = rs.getMetaData();
        System.out.println(connection);

	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day2", "root", "ajith123");
		return connection;

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 /*
	public static void insert(int items,int productId, String productName, int qty,
			int price, int totalPrice) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
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
		Connection connection = getConnection();
		String query = "delete from product where items=3";
		PreparedStatement prepare =connection.prepareStatement(query);
		System.out.println("deleted successfully");
		prepare.execute();
		connection.close();
	}
	
	public static void  update(String productName) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "update product set product_name= 'snacks' where items=11";
		PreparedStatement prepare =connection.prepareStatement(query);
		System.out.println("updated successfully");
		prepare.execute();
		connection.close();
	}
	
	
	
	public static void registerUser( String username, int password )
            throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
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

	} */ 
      
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* public static void registerLogin( String username, int password )
                throws ClassNotFoundException, SQLException {
            Connection connection = getConnection();
            String selectQuery = "select username,password from login where password= ? ";
            PreparedStatement prepare = connection.prepareStatement(selectQuery);
            prepare.setInt(1, password);
            ResultSet rs = prepare.executeQuery();

            if (!rs.next()) {
                String insertQuery = "insert into login (username, password) values ( ?, ?)";
                PreparedStatement insert = connection.prepareStatement(insertQuery);
                insert.setString(1, username);
                insert.setInt(2, password);
                insert.executeUpdate();
                System.out.println("password is successfully.");
            } else {
                System.out.println("password is  already exists .");
            }

    }

	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void delete(int items) throws ClassNotFoundException, SQLException {
	Connection connection = getConnection();
	String query = "delete from product where items=?";
	PreparedStatement prepare = connection.prepareStatement(query);
	System.out.println("deleted successfully");
	prepare.execute();
	connection.close();
}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void update(String username) throws ClassNotFoundException, SQLException
	{
		Connection connection = getConnection();
		String query = "update student set username= where product_id='";
		PreparedStatement prepare=connection.prepareStatement(query);
	    System.out.println("updated successfully");
	    prepare.execute();
	    connection.close();
	}*/

	
}
       
	



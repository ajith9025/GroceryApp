package com.chainsys.model;


public class Product {
	String userName;
	double password;
	double items;
	int productId;
	String productName;
	int qty;
	int price;
	int totalPrice;
	String addToCard;
	String review;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getPassword() {
		return password;
	}
	public void setPassword(double password) {
		this.password = password;
	}
	public double getItems() {
		return items;
	}
	public void setItems(double items) {
		this.items = items;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getAddToCard() {
		return addToCard;
	}
	public void setAddToCard(String addToCard) {
		this.addToCard = addToCard;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Product(String userName, double password, double items, int productId, String productName, int qty,
			int price, int totalPrice, String addToCard, String review) {
		
		this.userName = userName;
		this.password = password;
		this.items = items;
		this.productId = productId;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
		this.totalPrice = totalPrice;
		this.addToCard = addToCard;
		this.review = review;
	}
	
	@Override
	public String toString() {
		return "Product [userName=" + userName + ", password=" + password + ", items=" + items + ", productId="
				+ productId + ", productName=" + productName + ", qty=" + qty + ", price=" + price + ", totalPrice="
				+ totalPrice + ", addToCard=" + addToCard + ", Review=" + review + "]";
	}
}
	

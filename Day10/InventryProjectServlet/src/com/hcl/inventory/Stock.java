package com.hcl.inventory;

public class Stock {
	private String stockid;
	private String itemname;
	private double price;
	private double quantityavail;
	
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantityavail() {
		return quantityavail;
	}
	public void setQuantityavail(double quantityavail) {
		this.quantityavail = quantityavail;
	}
	
	

}

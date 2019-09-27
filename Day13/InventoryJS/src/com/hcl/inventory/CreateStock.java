package com.hcl.inventory;

public class CreateStock {
	private String Stockid;
	private String itemName;
	private double price;
	private double quantityAvail;
	public String getStockid() {
		return Stockid;
	}
	public void setStockid(String stockid) {
		Stockid = stockid;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantityAvail() {
		return quantityAvail;
	}
	public void setQuantityAvail(double quantityAvail) {
		this.quantityAvail = quantityAvail;
	}
	
	public String createStock(){
		Stock stock=new Stock();
		String stockid=StockBAL.generateStockidBal();
		stock.setStockid(stockid);
		stock.setItemname(itemName);
		stock.setPrice(price);
		stock.setQuantityavail(quantityAvail);
		return StockBAL.createStockBal(stock);
	}
	 
}

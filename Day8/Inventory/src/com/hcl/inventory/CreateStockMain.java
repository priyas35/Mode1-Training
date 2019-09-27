package com.hcl.inventory;

import java.util.Scanner;

public class CreateStockMain {
	public static void main(String[] args) {
		String stockid=StockBAL.generateStockidBal();
		String itemname;
		double price,quantityavail;

		Stock stock=new Stock();
		stock.setStockid(stockid);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter item name");
		stock.setItemname(sc.nextLine());
		System.out.println("enter price");
		stock.setPrice(Double.parseDouble(sc.nextLine()));
		System.out.println("enter quantity available");
		stock.setQuantityavail(Double.parseDouble(sc.nextLine()));
	
		System.out.println(StockBAL.createStockBal(stock));
		
	}

}

package com.hcl.inventory;

import java.util.Scanner;



public class SearchStockMain {
	public static void main(String[] args) {
		String stockid;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stock id ");
		stockid = sc.nextLine();
		Stock stock=StockBAL.searchStockBal(stockid);
		if(stock != null){
			System.out.println("item name " + stock.getItemname());
			System.out.println("price " + stock.getPrice());
			System.out.println("quantity available " + stock.getQuantityavail());
			
		}else
		{
			System.out.println("!!! stackid not found !!!"
					+ "");
		}
	}

}

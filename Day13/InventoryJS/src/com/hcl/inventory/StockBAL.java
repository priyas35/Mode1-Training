package com.hcl.inventory;

public class StockBAL {
	
	public static String placeOrderBal(String stockId,int qtyOrd) {
		return new StockDAO().placeOrder(stockId, qtyOrd);
	}
	public static int generateOrderidBal(){
		return new StockDAO().generateOrderIdDao();
	}
	
	public static Stock searchStockBal(String stockid){
		return new StockDAO().searchStockDao(stockid);
	}
	
	public static String createStockBal(Stock stock){
		return new StockDAO().createStockDao(stock);
	}
	
	public static String generateStockidBal(){
		return new StockDAO().generateStockidDao();
	}

}

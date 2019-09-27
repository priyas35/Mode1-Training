package com.hcl.inventory;

public class PlaceOrder {
	private String stockId;
	private int qtyord;
	
	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public int getQtyord() {
		return qtyord;
	}

	public void setQtyord(int qtyord) {
		this.qtyord = qtyord;
	}

	public String placeOrder(){
		return StockBAL.placeOrderBal(stockId, qtyord);
	}

}

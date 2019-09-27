package com.hcl.products;

public class Order {
     private int qtyOrd,orderid;
     private Product objproduct;
	public int getQtyOrd() {
		return qtyOrd;
	}
	public void setQtyOrd(int qtyOrd) {
		this.qtyOrd = qtyOrd;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Product getObjproduct() {
		return objproduct;
	}
	public void setObjproduct(Product objproduct) {
		this.objproduct = objproduct;
	}
     
     public void display(){
    	 System.out.println("Quantity Orded : " +qtyOrd+" OrderId : "+orderid);
    	 objproduct.product();
     }
}

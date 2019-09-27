package com.hcl.products;

import java.util.List;

public class OrderLogic {
	private List items;

	public List getItems() {
		return items;
	}

	public void setItems(List items) {
		this.items = items;
	}
	
	public void display(){
		for(int i=0;i<items.size();i++){
			Order c=(Order)items.get(i);
			c.display();
			int value=c.getQtyOrd()-c.getObjproduct().getQuantityAvail();
			if(!(value>=0)){
				System.out.println("Total Amount= " +(c.getObjproduct().getPrice()*c.getQtyOrd()));
			}else{
				System.out.println("Insufficient Product");
			}
		}
	}

}

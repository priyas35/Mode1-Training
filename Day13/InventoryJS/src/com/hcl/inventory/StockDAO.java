package com.hcl.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hcl.inventory.DaoConnection;

public class StockDAO {
	
	PreparedStatement pst;
	Connection con;
	
	
	public int generateOrderIdDao(){
		con=DaoConnection.getConnection();
		int orderid=0;
		String cmd="select case when max(orderid) is null then 1"
				+ " else max(orderid)+1 "
				+ "end orderid from orders";
		try {
			pst=con.prepareStatement(cmd);
			
	 			ResultSet rs=pst.executeQuery();
	 			rs.next();
	 			orderid=rs.getInt("orderid");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return orderid;     
	}
	
	public String placeOrder(String stockId,int qtyOrd) {
		con=DaoConnection.getConnection();
		Stock stock=searchStockDao(stockId);
		String result="";
		if(stock!=null) {
			double qtyAvail=stock.getQuantityavail();
			if(qtyAvail-qtyOrd >= 0) {
				String cmd="update stock set quantityavail=quantityavail-? where stockid=?";
				try {
					pst=con.prepareStatement(cmd);
					pst.setDouble(1, qtyOrd); 
					pst.setString(2, stockId);
					pst.executeUpdate();
					int ordid=generateOrderIdDao();
					 cmd="insert into orders(orderid,stockid,qtyord,billamt) values(?,?,?,?) ";
					 pst=con.prepareStatement(cmd);
		             pst.setInt(1,ordid);
		             pst.setString(2,stockId);
		             pst.setDouble(3, qtyOrd);
		             double total=qtyOrd*stock.getPrice();
		             pst.setDouble(4, total);
      	             pst.executeUpdate();
      	             cmd="Update amount set Gamt=Gamt+?";
      	             pst=con.prepareStatement(cmd);
      	             pst.setDouble(1, total);
      	             pst.executeUpdate();
      	             result="Order Placed Successfully...";
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				result="Insufficent Quantity...";
			}
		} else {
			result="StockID not found...";
		}
		return result;
	}
	
	
	public Stock searchStockDao(String stockid){
		con= DaoConnection.getConnection();
		String cmd="select * from stock where stockid=?";
		Stock stock=null;
		try {
			pst=con.prepareStatement(cmd);
			pst.setString(1, stockid);
			
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				stock=new Stock();
				stock.setItemname(rs.getString("itemname"));
				stock.setPrice(rs.getDouble("price"));
				stock.setQuantityavail(rs.getDouble("quantityavail"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stock;
	}
	
	public String createStockDao(Stock stock){
		con=DaoConnection.getConnection();
		String cmd="insert into stock(stockid,itemname,price,quantityavail) values(?,?,?,?) ";
		String result="";
		try {
			pst=con.prepareStatement(cmd);
			pst.setString(1, stock.getStockid());
			pst.setString(2, stock.getItemname());
			pst.setDouble(3, stock.getPrice());
			pst.setDouble(4, stock.getQuantityavail());
			pst.executeUpdate();
			result="created successfully";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return result;
	}
	
	
	public String  generateStockidDao(){
		con=DaoConnection.getConnection();
		String cmd="Select max(stockId) sid from stock";
		String stid="";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			stid=rs.getString("sid");
			int id=Integer.parseInt(stid.substring(1));
			id++;
			 String formatted = String.format("%03d", id);
			stid="S"+formatted;
//			if(id >= 1 && id <= 9) {
//				stid="S00"+id;
//			}
//			if(id >= 10 && id <= 99) {
//				stid="S0"+id;
//			}
//			if(id >= 100 && id <= 999) {
//				stid="S"+id;
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stid;
}
}

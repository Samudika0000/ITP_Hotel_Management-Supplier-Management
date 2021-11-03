package com.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.suppliermanagement.model.Supplier;

public class SupplierDBUtil {
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	boolean isSuccess = false;
	
	public ArrayList<Supplier> getSuppliers(){		
		ArrayList<Supplier> sup=new ArrayList<>();
		try {			
			con = DatabaseConnection.getConnection();
			stmt=(Statement) con.createStatement();
			String sql = "select * from supplier";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				int supId=rs.getInt(1);
				String Name=rs.getString(2);
				String Email=rs.getString(3);
				String ConatactNumber=rs.getString(4);
				String Category=rs.getString(5);
				String CompanyName=rs.getString(6);
				String CompanyAddress=rs.getString(7);
				
				
				Supplier s = new Supplier(supId,Name,Email,ConatactNumber,Category,CompanyName, CompanyAddress);
				sup.add(s);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sup;
	
	} 
	
	public ArrayList<Supplier> getSupplier(String id){		
		ArrayList<Supplier> sup=new ArrayList<>();
		try {
			con = DatabaseConnection.getConnection();
			stmt=(Statement) con.createStatement();
			String sql = "select * from supplier where SupID='"+Integer.parseInt(id)+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				int supId=rs.getInt(1);
				String Name=rs.getString(2);
				String Email=rs.getString(3);
				String ConatactNumber=rs.getString(4);
				String Category=rs.getString(5);
				String CompanyName=rs.getString(6);
				String CompanyAddress=rs.getString(7);
				
				
				Supplier s = new Supplier(supId,Name,Email,ConatactNumber,Category,CompanyName, CompanyAddress);
				sup.add(s);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sup;
	
	} 
	
	public boolean updateSupplier(String id,String name, String email, String contactnumber, String category,String companyname, String companyaddress) {
		try {
			con = DatabaseConnection.getConnection();
			stmt=(Statement) con.createStatement();
			String sql="update supplier set Name='"+name+"',Email='"+email+"',ContactNumber='"+contactnumber+"',Category='"+category+"',CompanyName='"+companyname+"',CompanyAddress='"+companyaddress+"' WHERE SupId = " + id;
			int rs=stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
		return isSuccess;
	}
	
	public boolean insertSupplier(String name, String email, String contactnumber,String category,String companyname, String companyaddress) {
    	try {
    		con = DatabaseConnection.getConnection();
    		stmt = (Statement) con.createStatement();
    		
    	    String sql = "insert into supplier values (0,'"+name+"','"+email+"','"+contactnumber+"','"+category+"','"+companyname+"','"+companyaddress+"')";
    	    int rs = stmt.executeUpdate(sql);    
    	    if(rs > 0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
    	}catch (Exception e) {
    		e.printStackTrace();
    	} 	
    	return isSuccess;
	}
	
	public boolean deleteSupplier(String Id) {
		int supId = Integer.parseInt(Id);
		try {
    		con = DatabaseConnection.getConnection();
    		stmt = (Statement) con.createStatement();
    		String sql = "delete from Supplier where SupId='"+supId+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if (rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}    	
    	return isSuccess;		
	}
}

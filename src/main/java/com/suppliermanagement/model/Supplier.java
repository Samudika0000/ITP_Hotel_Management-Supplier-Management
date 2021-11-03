package com.suppliermanagement.model;

public class Supplier {
	public int Id;
	public String Name;
	public String Email;
	public String ContactNumber;
	public String Category;
	public String CompanyName;
	public String CompanyAddress;
	
	public Supplier(int Id, String name, String email, String contactNumber, String category,
			String companyName, String companyAddress)
	{
		super();
		this.Id = Id;
		this.Name = name;
		this.Email = email;
		this.ContactNumber = contactNumber;
		this.Category = category;
		this.CompanyName = companyName;
		this.CompanyAddress = companyAddress;
	}
}

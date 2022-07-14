package com.chainsys.test;

public class Bank {
	private final int customerId;
	private String name;
	private  String accountnumber;
	private String address;
	private String phonenumber ;
	private String emailid;
	public Bank(int customerId) {
		this.customerId=customerId;
		
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setPhonenumber(String phonenumber){
		this.phonenumber = phonenumber;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getEmailid() {
		return emailid;
	}
	
}

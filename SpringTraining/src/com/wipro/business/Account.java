/**
 * 
 */
package com.wipro.business;

/**
 * @author Manmohan Sharma
 *
 */
public class Account {
	String accountId;
	String name;
	long balance;
	Address address;
	public String getAccountId() {
		return accountId;
	}
	public String getName() {
		return name;
	}
	public long getBalance() {
		return balance;
	}
	public Address getAddress() {
		return address;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}

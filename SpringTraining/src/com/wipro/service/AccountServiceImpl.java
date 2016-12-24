/**
 * 
 */
package com.wipro.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.wipro.business.Account;

/**
 * @author Manmohan Sharma
 *
 */
public class AccountServiceImpl implements AccountService {

	
	@Override
	public void balanceEnquiry(Account account) {
		System.out.println("Balance Enquiry");
		
		System.out.println("Account Id-"+account.getAccountId()); 
		System.out.println("Account Name-"+account.getName()); 
		System.out.println("Account Balance-"+account.getBalance()); 
		System.out.println("Accoun Holder's Address- "+account.getAddress().getHouseNo()+", "+account.getAddress().getStreet()+", "
		+account.getAddress().getArea()+", "+account.getAddress().getZipcode()+", "+account.getAddress().getCity()); 
		
		
		
	}

	@Override
	public void displayDetails(Account account) {
		
		System.out.println("Diplay Details");
	
		System.out.println("Account Id-"+account.getAccountId()); 
		System.out.println("Account Name-"+account.getName()); 
		System.out.println("Accoun Holder's Address- "+account.getAddress().getHouseNo()+", "+account.getAddress().getStreet()+", "
		+account.getAddress().getArea()+", "+account.getAddress().getZipcode()+", "+account.getAddress().getCity()); 
		
		
	}

	
	@Override
	public void updateDetails(Account account) {
		System.out.println("Update Details");
		
		BufferedReader br=null;
		try{
			br= new BufferedReader(new InputStreamReader(System.in)); 
			System.out.println("Enter new Name");  
			account.setName(br.readLine());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

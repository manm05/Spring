package com.wipro.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.business.Account;
import com.wipro.business.Address;
import com.wipro.service.AccountService;

public class MainClass {
	
	
	
	public static void main(String arga[]) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
		
		
		AccountService accountService=(AccountService) ctx.getBean("accountServiceImpl");
		
		ApplicationContext ctx1 =
				new AnnotationConfigApplicationContext(ConfigClass.class);
		Address address= (Address)  ctx1.getBean(Address.class);
		Account account= (Account) ctx1.getBean(Account.class);
		
		address.setHouseNo(32);
		address.setCity("Dublin"); 
		address.setArea("Rathgar"); 
		address.setStreet("Terenure Road East"); 
		address.setZipcode("Dublin6"); 
		
		account.setAccountId("12345");
		account.setName("Manmohan Sharma");
		account.setBalance(50000); 
		account.setAddress(address); 
		
		accountService.balanceEnquiry(account);
		accountService.updateDetails(account);
		System.out.println("****************After Updating the details************");  
		accountService.displayDetails(account); 
		
		
		
		
		
	}

}

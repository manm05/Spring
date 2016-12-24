package com.wipro.main;

import org.springframework.context.annotation.*;

import com.wipro.business.Account;
import com.wipro.business.Address;


@Configuration

public class ConfigClass {

	@Bean
	
	public Account account(){
		
		return new Account();
	}
	
	
	@Bean
	
	public Address address(){
		
		return new Address();
	}
}

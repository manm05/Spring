/**
 * 
 */
package com.wipro.service;

import com.wipro.business.Account;

/**
 * @author Manmohan Sharma
 *
 */
public interface AccountService {
	
	public void  balanceEnquiry(Account account);
	public void  displayDetails(Account account);
	public void  updateDetails(Account account);
	

}

/**
 * 
 */
package com.wipro.business;

/**
 * @author Manmohan Sharma
 *
 */
public class Address {
	
	private int  houseNo;
	private String street;
	private String Area;
	private String city;
	private String zipcode;
	public int getHouseNo() {
		return houseNo;
	}
	public String getStreet() {
		return street;
	}
	public String getArea() {
		return Area;
	}
	public String getCity() {
		return city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setArea(String area) {
		Area = area;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
}

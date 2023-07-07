package com.emp;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "a3") //replacement of <bean id="a3" class="com.emp.Address"></bean>
public class Address implements BeanNameAware{
//	@Value("Malaysia")
	private String country;
//	@Value("Kuala Lumpur")
	private String city;
//	@Value("43456")
	private int postalCode;
	
	public Address() {
		super();
	}


	public Address(String country, String city, int postalCode) {
		super();
		this.country = country;
		this.city = city;
		this.postalCode = postalCode;
		System.out.println("Inside default constructor of Address");
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		System.out.println("Inside setCountry method.");
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Inside setCity method.");
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}


	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", postalCode=" + postalCode + "]";
	}


	@Override
	public void setBeanName(String arg0) {
		System.out.println("Inside setBeanName " + arg0);
		
	}
	
	
	
	
	
	
}

package com.example.demo;
import org.springframework.stereotype.Component;
@Component("street1")
public class Address {
	
	private String streetAddy;
	private int zipcode;
	private String city;
	private String state;
	
	public String getStreetAddy() {
		return streetAddy;
	}
	public void setStreetAddy(String streetAddy) {
		this.streetAddy = streetAddy;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public void addressFormat() {
		System.out.println("Address: "+ getStreetAddy()+" " + getCity()+" " + getState() +" "+ getZipcode());
	}
	
	public void lifeExpectancy() {
		if(this.zipcode <= 10282  ) {
			System.out.println("Life expectancy in  Manhattan: " + 84.86);
		}else if(this.zipcode <= 10314) {
			System.out.println("Life expectancy in  Staten Island: " +  80.85);
		}else if(this.zipcode <= 10475) {
			System.out.println("Life expectancy in Bronx" + 80.56);
		}else if(this.zipcode < 11257 && this.zipcode > 11200 ) {
			System.out.println("Life expectancy in Brooklyn: " + 82.64 );
		}else {
			System.out.println("Life expectancy in Queens: " + 83.85 );
		}
	}
	
	
	
	
	
	
	
//	public String getStreet() {
//		return street;
//	}
//	public void setStreet(String street) {
//		this.street = street;
//	}
//	
//	
//	public void streetname() {
//		System.out.println("Street: " + getStreet());
//	}
	
	
	
	
	
	
}
package com.example.demo;
import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop {
	private int lid;
	private String brand;
	private  double price;
	
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}
	

	public double getPrice(double price) {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public void brandname() {
//		System.out.println("HP Laptop");
		System.out.println(getBrand());
	}
	
	 public double taxS() {
		 double sum = this.price * .0825;
		 sum=sum + this.price;
		 return sum;
	
	 }

	public double getPrice() {
		return price;
	}


	
	
	
	
	
	
	




}

package com.example.demo;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;
@Component

public class person {

	private int pid;
	private String pname;
	private String tech;
	
	
	
	@Autowired 
	@Qualifier("laptop")
	private Laptop lap;
	
	@Autowired
	@Qualifier("street1")
	public Address addy;
	
//	@Autowired
//	@Qualifier("employee")
////	private Employee
//	private Employee emp1;
	
	public person() {
		System.out.println("Object created");
	}
	
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}


	public Laptop getLaptop() {
		return lap;
	}
	public void setLaptop(Laptop laptop) {
		this.lap = laptop;
	}
	
	
	
	public void show() {
//		System.out.println("Inside person class show method...");
//		System.out.println(getPid());
//		System.out.println(getPname());
//		System.out.println(getTech());
		lap.brandname();
		addy.lifeExpectancy();
//		System.out.println(addy.getZipcode());
		addy.addressFormat();
		System.out.println(lap.taxS());
	
	}

	public Address streetA() {
		return addy;
	}
	public Laptop laptopX() {
		return lap;
	}

}

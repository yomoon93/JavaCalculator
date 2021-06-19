package com.example.demo;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext Context=SpringApplication.run(FirstProjectApplication.class, args);
	System.out.println("SpringBoot app running...");
	
	Scanner scan = new Scanner(System.in);
	
	
	// p1 is a bean 
	person p1 = Context.getBean(person.class);
//	System.out.println("Enter id number");
//	p1.setPid(scan.nextInt());
//	System.out.println("Enter the first name");
//	p1.setPname(scan.next().trim());
//	System.out.println("What tech are you using?");
//	p1.setTech(scan.nextLine());
//	scan.nextLine();
//	System.out.println("What brand do you have?");
//	p1.getLaptop().setBrand(scan.next());
	System.out.println("How much did it cost?");
	p1.getLaptop().setPrice(scan.nextDouble());
	System.out.println("Whats your street address?");
	p1.addy.setStreetAddy(scan.nextLine());
	scan.nextLine();
	System.out.println("Whats youe zipcode");
	p1.streetA().setZipcode(scan.nextInt());
	System.out.println("Whats your city?");
	p1.streetA().setCity(scan.nextLine());
	scan.nextLine();
	System.out.println("whats your state");
	p1.addy.setState(scan.next());
	
	System.out.println();
	
	
	 scan.close();
	
	
	
	
	p1.show();
	}

}

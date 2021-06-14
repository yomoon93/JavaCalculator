package OOPConcepts;
import java.util.Scanner;  
public class Starter {
	
	
	 static void interest(int principal, double rate, int time) {
		double sum = principal* rate*time;
		System.out.println(sum);
	}

	public static void main(String[] args) {
String word,dName = null, major = null, titleJob=null;
int dAge=0, sub=0,sub2=0, sub3=0,id = 0, bonus=0, sHours=0, empHours=0;
char dGender = 0;
double salary=0;
		

//		Person person1 = new Person ("Booker", 34, 'M');
//		Person person2 = new Person ("Hope", 34, 'M');
//		Person person3 = new Person ("Jake", 12, 'F');
Employee emp1 = new Employee(dName,dAge, dGender,id, salary, bonus, titleJob,empHours);
		
Scanner scan = new Scanner(System.in);
	
	System.out.println("Are you a student or a employee");
	word = scan.next().toLowerCase();
	switch(word) {
	case "student":
		System.out.println(" Id: ");
		id = scan.nextInt();
		System.out.println("Name: ");
		dName= scan.next();
		scan.nextLine();
		System.out.println("Age: ");
		dAge = scan.nextInt();
		System.out.println("Gender: ");
		dGender = scan.next().charAt(0);
		System.out.println("Grade of Subject 1: ");
		sub = scan.nextInt();
		System.out.println("Grade Of Subject 2: ");
		sub2 = scan.nextInt();
		System.out.println("Grade Of Subject 3: ");
		sub3 = scan.nextInt();
		System.out.println("Major: ");
		major= scan.next();
		System.out.println("How many hours did you work at your intership per day?: ");
		sHours=scan.nextInt();
		//first way to type in the variables
		Student Jae = new Student(id,dName,dAge, dGender, sub, sub2, sub3,major,sHours);
		Jae.display();
		System.out.println(Jae.calculate(3));
	
		break;
		//second way to type the variables in
	case "employee":
		System.out.println("Id: ");
		emp1.emp_id = scan.nextInt();
		System.out.println("Name: ");
		emp1.dName= scan.nextLine();
		scan.nextLine();
		System.out.println("Age: ");
		emp1.dAge = scan.nextInt();
		System.out.println("Gender: ");
		emp1.dGender = scan.next().charAt(0);
		System.out.println("Salary: ");
		emp1.emp_salary= scan.nextDouble();
		System.out.println("Bonus: ");
		emp1.emp_bonus=scan.nextInt();
		System.out.println("Job Title: ");
		emp1.titleJob=scan.next();
		scan.nextLine();
		System.out.println("How many hours worked per day: ");
		emp1.empHours = scan.nextInt(); 
		
		System.out.println("Salary + Bonus :" + emp1.calculate(bonus));
		emp1.display();
		break;
	}
		

		
//		System.out.println(Jae.calculate(3));
//		emp1.display();


//		
		
		
//		Employee emp2 = new Employee(2, "Kevin", 28, 'M', 150000, 40000);
		
//		emp3.display();
//		double answer =  emp3.calculate(40000);
		
	
//		System.out.println(an4

//		Person1 p1 = new Person1();
//		System.out.println("Enter the name: ");
//		name1 = scan.nextLine();
//		p1.setdName(name1);
//		System.out.println("Your age");
//		age1 = scan.nextInt();
//		p1.setdAge(age1);
//		System.out.println("What's your gender?");
//		gender1 = scan.next().charAt(0);
//		p1.setdGender(gender1);
//		scan.nextLine();
//		
//		
//		
//		System.out.println("Person 1 Information: ");
	
	// getter method
//		System.out.println(p1.getdName());
//		System.out.println(p1.getdAge());
//		System.out.println(p1.getdGender());
//		
//		
//		Person1 p2 = new Person1();
//		System.out.println("Enter the name of the Dog");
//		name2 = scan.nextLine();
//		p2.setdName(name1);
//		System.out.println("Type their age");
//		age2 = scan.nextInt();
//		p2.setdAge(age2);
//		System.out.println("What's your gender?");
//		gender2 = scan.next().charAt(0);
//		p2.setdGender(gender2);
//		
//		
//		
//		System.out.println("Person 2 Information: ");
//		System.out.println(p2.getdName());
//		System.out.println(p2.getdAge());
//		System.out.println(p2.getdGender());

// new stuff we are adding to the code just to text constructor
//		Employee emp1 = new Employee(2,"Kevin",28,'M',5000.68);
//		emp1.display();
//		interest(3, .5, 2);
		


		
		scan.close();
		
		
//		person1.display();
//		person2.display();
//		person3.display();
	}


}

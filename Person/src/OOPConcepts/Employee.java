package OOPConcepts;

public class Employee extends Person implements InterfaceOOP {
	int emp_id;
	double emp_salary;
	int emp_bonus;
	double hours;
	String titleJob;
	int empHours;
	Employee(String dName, int dAge, char dGender, int id, double salary, int bonus, String titleJob,int empHours ){
		super(dName,dAge,dGender);
		this.emp_id=id;
		this.emp_salary=salary;
		this.emp_bonus = bonus;
		this.titleJob = titleJob;
		this.empHours = empHours;
	}
	
	
public double hoursWorked (int work) {
	double hours = ((work)*5);
	return  hours;
}



public double calculate(int bonus) {
		double sum = this.emp_salary + this.emp_bonus;
		return sum;
	}
	
	
	
	public void display() {
		System.out.println(ORGANIZATION);
		System.out.println("ID: "+ this.emp_id);
		super.display();
		System.out.println("Salary: " + this.emp_salary);
		System.out.println("Bonus: " + this.emp_bonus);
		System.out.println("Job Title: " + this.titleJob);
		System.out.println("Hours worked per week " + hoursWorked(this.empHours));
	}


}
 
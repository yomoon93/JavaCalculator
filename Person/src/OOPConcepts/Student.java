package OOPConcepts;

public class Student extends Person implements InterfaceOOP {
	 int student_id;
	 int subject1;
	 int subject2;
	 int subject3;
	 int sHours;
	 String sMajor;
	 double totalScore;
	Student(int id, String dName, int dAge, char dGender, int sub, int sub2, int sub3, String major, int sHours){
		super(dName,dAge,dGender);
		this.student_id =id;
		this.subject1= sub;
		this.subject2 = sub2;
		this.subject3= sub3;
		this.sMajor=major;
		this.sHours= sHours;
	}
	
	// return double takes in int
	public double calculate(int numClasses) {
		double avg = ((this.subject1 + this.subject2 + this.subject3) /numClasses);
		return avg;
		
	}
	
	public double hoursWorked (int work) {
		double hours = ((work)*5);
		return  hours;
	}

	


	
	public void display(){
		System.out.println(ORGANIZATION);
		super.display();
		System.out.println("ID: "+this.student_id);
		System.out.println("Subject 1: "+ this.subject1);
		System.out.println("Subject 2: "+  this.subject2);
		System.out.println("Subject 3: " +  this.subject3);
		System.out.println("Major: " + this.sMajor);
		System.out.println("Hours worked: " + hoursWorked(this.sHours));
	
	}
	

	
	
	
	
	
	public static void main(String[] args) {
//		Student kevin = new Student(3,"Munar", 28, 'M', 80,95, 75,"Computer Engineer",89);
//		Student josh = new Student(2, "Kevin", 28, 'M', 88,95,80, "Computer Science",90);
//		josh.calculate(90);
//		kevin.display();
//		josh.display();
		
	}
}

package OOPConcepts;

	public class Person {
		static int count = 1;
		String dName;
		int dAge;
		char dGender;
		
		
		public Person (String name, int age, char gender) {
			 dName=name;
			 dAge=age;
			 dGender=gender;
			 count++;
		}

		
		public void display()
		{
			System.out.println("Name: " + this.dName);
			System.out.println("Gender: " + this.dGender);
			System.out.println("Age: " + this.dAge);
//			System.out.println(count);
		}
		
		
	}

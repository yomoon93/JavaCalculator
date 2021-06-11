import java.util.Scanner;
public class MathCal {
	
	
	public static void main(String[] args) {
		 int num;
		 int num2;
		 char sym;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
	 System.out.println("Choose first number");
	 num = scan.nextInt();
	 System.out.println("Choose second number");
	 num2 = scan.nextInt();
	 
	 System.out.println("What would  you do like to do with these numbers?");
	 sym = scan.next().charAt(0);
	 switch (sym) {
	 case '+': 
		 System.out.println(add(num, num2));
	 break;
	 case '-':
		 System.out.println(subtract(num, num2)); 
	 break;
	 case '*': 
		System.out.println(multiply(num, num2));
	 break;
	 case '/': 
		System.out.println(division(num, num2)) ;
	 break;
	 case '0': 
		 scan.close();
		 System.exit(0); 
	 		}
		}
	}
	
	public static int add(int num, int num2) {
		int sum = num + num2;
		return sum;
	}
	public static int subtract(int num, int num2) {
		int sum = num - num2;
		return sum;
	}
	public  static int multiply(int num, int num2) {
		int sum = num * num2;
		return sum;
	}
	public static int division(int num, int num2) {
		int sum = num / num2;
		return sum;
	}
	
	
	

}



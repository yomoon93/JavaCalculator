import java.util.Scanner;
public class MathCal {
		static int num;
		static int num2;
		static char sym;
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		while(true) {
	 System.out.println("Choose first number");
	 num = scan.nextInt();
	 System.out.println("Choose second number");
	 num2 = scan.nextInt();
	 
	 System.out.println("What would  you do like to do with these numbers?");
	 sym = scan.next().charAt(0);
	 switch (sym) {
	 case '+': add();
	 break;
	 case '-':subtract();
	 break;
	 case '*': multiply();
	 break;
	 case '/': division();
	 break;
	 case '0': 
		 scan.close();
		 System.exit(0); 
	 		}
		}
	}
	
	public static void add() {
		System.out.println(num + num2);
	}
	public static void subtract() {
		System.out.println(num - num2);
	}
	public static void multiply() {
		System.out.println(num * num2);
	}
	public static void division() {
		System.out.println(num * num2);
	}
	
	
	

}



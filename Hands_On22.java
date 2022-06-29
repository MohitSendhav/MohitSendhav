package java_fundamentals;
import java.util.*;
public class Hands_On22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to continue? Y or N");
		
		char choice1 = sc.next().charAt(0);
		do {
		
		System.out.println("1. Add\n2. Sub");
		int choice = sc.nextInt();
		
		int operand1;
		int operand2;
		int result;
		
		if (choice == 1) {
			System.out.println("Enter first operand: ");
			operand1 = sc.nextInt();
			System.out.println("Enter second operand: ");
			operand2 = sc.nextInt();
			result = operand1 + operand2;
		} else {
			System.out.println("Enter first operand: ");
			operand1 = sc.nextInt();
			System.out.println("Enter second operand: ");
			operand2 = sc.nextInt();
			result = operand1 - operand2;
		}
		
		System.out.println("Result: " + result);
		
		
		}
		while(choice1 == 'Y');
		
		sc.close();

	}

}

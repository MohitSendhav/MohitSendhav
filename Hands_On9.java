package java_fundamentals;

import java.util.*;
public class Hands_On9 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Age and gender Respectively");
		int age = s.nextInt();
		String gender = s.next();
		
		if (age<=58 && age>=1 && gender == "Female")
			System.out.println("Interest rate = 8.2%");
		else if (age>=59 && age <=120 && gender == "Female")
			System.out.println("Interest rate = 7.6%");
		else if (age>=61 && age <=120 && gender == "Male")
			System.out.println("Interest rate = 8.3%");
		else if (age<=60 && age>=1 && gender == "Male")
			System.out.println("Interest rate = 9.2%");
		else
			System.out.println("Please enter valid credentials");
		

	}

}

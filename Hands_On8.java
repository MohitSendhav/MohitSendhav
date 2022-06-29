package java_fundamentals;

import java.util.*;
public class Hands_On8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		char ch = s.next().charAt(0);
		
		if (Character.isDigit(ch) == true)
			System.out.println(" Digit");
		else if(Character.isLetter(ch) == true)
			System.out.println("Alphabet");
		else
			System.out.println("Special Character");
	}

}

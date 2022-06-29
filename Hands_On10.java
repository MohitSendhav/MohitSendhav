package java_fundamentals;

import java.util.*;
public class Hands_On10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		char ch = s.next().charAt(0);
		if (Character.isLowerCase(ch) == true)
			System.out.println(ch +" -> "+ (char)(ch-32));
		else 
			System.out.println(ch +" -> "+ (char)(ch+32));

	}

}

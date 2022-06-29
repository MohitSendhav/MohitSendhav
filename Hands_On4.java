package java_fundamentals;

import java.util.*;
public class Hands_On4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s = new Scanner(System.in);
		int num = Integer.parseInt(s.next());
		if (num<0)
		{
			System.out.println("entered num is negative");
		}
		else if(num==0) {
			System.out.println("Entered num is Zero");
		}
		else
			System.out.println("Entered num is positive");
		
	}

}

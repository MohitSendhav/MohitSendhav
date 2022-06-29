package java_fundamentals;

import java.util.*;
public class Hands_On6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		
		String Str = s.nextLine();
		
		if(Str == "" )
			System.out.println("Please enter something");
		else 
			{
			Str = Str.replace(" ",", ");
			System.out.println(Str);
			}
		
	}

}

package java_fundamentals;

import java.util.*;
public class Hands_On11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		char colorCode = s.next().charAt(0);
		if (colorCode == 'R')
			System.out.println("R -> Red");
		else if (colorCode == 'B')
			System.out.println("B -> Blue");
		else if (colorCode == 'G')
			System.out.println("G -> Green");
		else if (colorCode == 'Y')
			System.out.println("Y -> Yellow");
		else if (colorCode == 'O')
			System.out.println("O -> Orange");
		else if (colorCode == 'W')
			System.out.println("W -> White");
		else
			System.out.println("Please enter a valid color code");

	}

}

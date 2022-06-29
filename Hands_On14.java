package java_fundamentals;

import java.util.Scanner;
public class Hands_On14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int i = s.nextInt();
		int j;
		for (j = 2 ; j<i ; j++) {
			if (i%j == 0) {
				System.out.println("Entered no is not prime");
				break;
			}
			else if (i%(j+1) == 0) {
				System.out.println("entered no is prime");
				break;
			}
			

	}
		

}
}

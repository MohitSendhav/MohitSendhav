package java_fundamentals;
import java.util.*;
public class Hands_On17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int sum = 0;
		
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		
		System.out.println(sum);

	}

}

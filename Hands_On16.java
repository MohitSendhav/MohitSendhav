package java_fundamentals;
import java.util.*;
public class Hands_On16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner (System.in);
			    int num = s.nextInt();
			    boolean flag = false;
			    for (int i = 2; i <= num / 2; ++i) {
			      // condition for nonprime number
			      if (num % i == 0) {
			        flag = true;
			        break;
			      }
			    }

			    if (!flag)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
			  }
			

	}



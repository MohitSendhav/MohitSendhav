package java_fundamentals;
import java.util.*;

public class Hands_On12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		byte month = s.nextByte();
		String m ;
		switch(month) {
		case 1: m = "January";
		break;
		case 2: m= "February";
		break;
		case 3: m= "March";
		break;
		case 4: m= "April";
		break;
		case 5: m= "May";
		break;
		case 6: m= "June";
		break;
		case 7: m= "July";
		break;
		case 8: m= "August";
		break;
		case 9: m= "September";
		break;
		case 10: m= "October";
		break;
		case 11: m= "Noember";
		break;
		case 12: m= "December";
		break;
		default: m = "please enter a valid month no";
		
		}
		System.out.println (m);

	}

}

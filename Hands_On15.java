package java_fundamentals;

public class Hands_On15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10 ; i<=100; i++) {
			for (int j = 2;j<i ;j++) {
	
					if (i%j == 0) {
						break;
					}
					else if (i%(j+1) == 0) {
						System.out.print(" "+i);
						break;
					}
					
			}
		}
			

	}

}

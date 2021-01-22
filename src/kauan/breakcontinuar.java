package kauan;

import java.util.Scanner;

public class breakcontinuar {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("entre com um numero");
		int num = scan.nextInt();
		
		System.out.println ("entre com limite");
		int max = scan.nextInt();
	
	
		for (int  i=num; i<=max; i++) {
			System.out.println(i);
			if (i%7 == 0)
			System.out.println("O valor de i e:" + i);
			break;
		}
	}

}

package Exercicios;

import java.util.Scanner;

public class exercicios1 {
   

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println ("entre com o primeiro numero");
		int num1 = scan.nextInt();

		
		System.out.println ("entre com o primeiro numero");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			
			System.out.println("o num1 e maior: " +num1);
			
		} else {
			System.out.println("o num1 e maior: " +num2);
		}
	}

}

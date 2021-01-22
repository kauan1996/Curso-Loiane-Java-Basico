package Exercicios;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);

			System.out.println ("insira um numero: "  );
		
			int numero1 = scan.nextInt();
			
			System.out.println ("insira um numero: "  );
			
			int numero2= scan.nextInt();
						
			
			int resultado = numero1 + numero2;
					
			System.out.println ("insira um numero: " +resultado );
	}

}

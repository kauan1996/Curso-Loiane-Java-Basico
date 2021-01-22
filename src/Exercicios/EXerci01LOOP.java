package Exercicios;

import java.util.Scanner;

public class EXerci01LOOP {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
 
		boolean notaValida = false;
		 
		do {
			System.out.println("entre com uma nota: ");
			double nota = scan.nextDouble();
	        
		
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("voce difitou: " +nota);

			} else {

				System.out.println("nota invalida, digite novamente: ");
			}
		} while (!notaValida);
	} 

}

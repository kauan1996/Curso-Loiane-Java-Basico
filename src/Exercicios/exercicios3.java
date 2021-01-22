package Exercicios;

import java.util.Scanner;

public class exercicios3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Entre com uma letra (F ou M)");
		String input = scan.next();
		
		if (input.equalsIgnoreCase("F")) {
			System.out.println("F - FEMININO");
			
		} else if (input.equalsIgnoreCase("M")) {
			System.out.println("M - MASCULINO");	
		} else {
			System.out.println("Sexo invalido");
		}

	}

}

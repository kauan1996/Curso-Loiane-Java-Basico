package Exercicios;

import java.util.Scanner;

public class exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println ("me fale sua altura");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) -58;
		
		System.out.println ("o peso ideal: " +pesoIdeal);
		
		
	}

}

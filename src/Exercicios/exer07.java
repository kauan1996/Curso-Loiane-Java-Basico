package Exercicios;

import java.util.Scanner;

public class exer07 {

	public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
		
		System.out.println ("entre o tamanho do quadrado");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado,2);
		
		System.out.println("a area do Quadrado e:"  +area );
		System.out.println("o Dobro do quadrado é:" +(area*2));
	}

	}



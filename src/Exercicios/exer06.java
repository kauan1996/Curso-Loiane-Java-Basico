package Exercicios;

import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
		System.out.println ("entre c om o raio do circulo");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("a area do circulo e:"  +area );
	}

	}



package Exercicios;

import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
		System.out.println( "entre com a temperatura em celsius:");
		double c = scan.nextDouble();
		
		double f = (c*1.8)+32;
		
		System.out.println ("A temperatura" +c+ "F é igual a: " +f+ "F"); 

	}

}

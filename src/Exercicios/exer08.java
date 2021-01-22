package Exercicios;

import java.util.Scanner;

public class exer08 {

	public static void main(String[] args) {

	Scanner scan = new Scanner (System.in);
	
	System.out.println("Entre com o valor/hora");
	double valorHora = scan.nextDouble();
	
	System.out.println ("entre com a quantidade de horas trabalhas no mes");
    double horas = scan.nextDouble();
    
    double salario = valorHora * horas;
    
    System.out.println ("O seu salario é de " +salario);
	
	}
}

package Exercicios;

import java.util.Scanner;

public class exercicios5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("entre com a primeira nota");
		double nota1 = scan.nextDouble();

		System.out.println("entre com a primeira nota");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2);
		if (media >= 10) {

			System.out.println("aprovado com distinção");

		} else if (media >= 7) {
			System.out.println("aprovado");
		} else {
			System.out.println("reprovado");
		}
	}
}
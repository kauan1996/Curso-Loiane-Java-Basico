package Exercicios;

import java.util.Scanner;

public class exercicios8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("entre com a primeira PREÇO");
		double preco1 = scan.nextDouble();

		System.out.println("entre com a SEGUNDO PREÇO");
		double preco2 = scan.nextDouble();

		System.out.println("entre com a TERCEIRO PREÇO");
		double preco3 = scan.nextDouble();

		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("compre o produto 1");
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("compre o produto 2");
		} else if (preco3 <= preco1 && preco3 <= preco2) {
			System.out.println("compre o produto 3");

		}
	}
}

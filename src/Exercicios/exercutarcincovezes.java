package Exercicios;

import java.util.Scanner;

public class exercutarcincovezes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		double media;
		int soma = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("digite seu numero");
			num = scan.nextInt();

			soma += num;
		}
		media = soma / 5;

		System.out.println("soma: " + soma);
		System.out.println("media: " + media);
	}

}

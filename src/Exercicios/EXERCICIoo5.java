package Exercicios;

import java.util.Scanner;

public class EXERCICIoo5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double popA;
		double popB;
		double taxaA;
		double taxaB;
		boolean valido = false;

		do {

			System.out.println("entre com a popula��o A: ");
			popA = scan.nextDouble();

			if (popA > 0) {
				valido = true;

			} else {

				System.out.println("popula�o A presisa ser maior que  0");
			}

		} while (!valido);

		valido = false;

		do {

			System.out.println("entre com a popula��o B : ");
			popB = scan.nextDouble();

			if (popB > 0) {
				valido = true;

			} else {

				System.out.println("popula�o B presisa ser maior que  0");
			}

		} while (!valido);

		valido = false;

		do {

			System.out.println("entre com a taxa de crescimento com a taxa de popula�ao A: ");
			taxaA = scan.nextDouble();

			if (taxaA > 0) {
				valido = true;

			} else {

				System.out.println("taxa de crescimento precisa ser maio que 0");
			}

		} while (!valido);

		valido = false;

		do {

			System.out.println("entre com a taxa de crescimento com a taxa de popula�ao B:");
			taxaB = scan.nextDouble();

			if (taxaB > 0) {
				valido = true;

			} else {

				System.out.println("taxa de crescimento precisa ser maio que 0");
			}

		} while (!valido);

		int cont = 0;

		while (popA < popB) {

			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}

		System.out.println("a popula�ao A: " + popA);

		System.out.println("a popula�ao B: " + popB);

		System.out.println("QTD anos: " + cont);
	}
}

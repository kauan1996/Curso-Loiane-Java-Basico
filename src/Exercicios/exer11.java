package Exercicios;

import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("entre com um numero ");
		int num1 = scan.nextInt();

		System.out.println("entre com um segundo numero");
		int num2 = scan.nextInt();

		System.out.println("entre com um terciro numero");
		int num3 = scan.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 e maior: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 e maior: " + num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("num3 e maior: " + num3);
		}
		  if (num1 < num2 && num1 < num3) {
			System.out.println("num1 e menor: " + num1);
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("num2 e menor: " + num2);
		} else if (num3 < num1 && num3 < num2) {
			System.out.println("num3 e menor: " + num3);
		}
	}
}

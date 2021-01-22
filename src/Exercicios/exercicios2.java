package Exercicios;

import java.util.Scanner;

public class exercicios2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println ("entre com um numero");
		int num = scan.nextInt();
		
		if (num >=0) {
			System.out.println ("O numero informado e positivo");
		}else {
			System.out.println ("O numero informado  e negativo");
		}

	}

}

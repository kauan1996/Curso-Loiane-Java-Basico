package kauan;

import java.util.Scanner;

public class valoritem {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	System.out.println ("entre com um valor:");
	double valor = scan.nextDouble();
	
	if (valor <= 10) {
		System.out.println("esta barato, pode compara");
	} else if (valor >10 && valor <15) {
		System.out.println("Pode pedir desconto");
	} else if (valor >=15 && valor <17) {
		System.out.println("SAI FORA");
	} else {
		System.out.println("MUITOOOOOOOOOO CARO");
	}
	
	}
}


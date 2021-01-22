package Exercicios;

import java.util.Scanner;

public class informacoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean infovalida = false;
		String nome;
		String sexo;
		String estadoCivil;
		int idade;
		double salario;

		do {
			System.out.println("entre com o nome");

			nome = scan.next();

			if (nome.length() >= 3) {
				infovalida = true;
			} else {
				System.out.println("noma precisa no minimo 3 caracter");
			}
		} while (!infovalida);

		do {
			System.out.println("entre com o idade");

			idade = scan.nextInt();

			if (idade >= 0 && idade <= 150) {
				infovalida = true;
			} else {
				System.out.println("noma precisa no minimo 3 caracter");

			}
		} while (!infovalida);

		infovalida = false;

		do {
			System.out.println("entre com o salario");

			salario = scan.nextDouble();

			if (idade > 0) {
				infovalida = true;
			} else {
				System.out.println("salario precisa ser maio que 0");

			}
		} while (!infovalida);
		infovalida = false;

		do {
			System.out.println("entre com o sexo");

			sexo = scan.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infovalida = true;

			} else {
				System.out.println("sexo precisa ser F ou M");

			}
		} while (!infovalida);
		infovalida = false;

		do {
			System.out.println("estado civil");

			estadoCivil = scan.next();
			infovalida = (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) ? true : printar();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infovalida = true;

			} else {

			}
		} while (!infovalida);

		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("salario: " + salario);
		System.out.println("sexo: " + sexo);
		System.out.println("estado civil: " + estadoCivil);
	}

	private static boolean printar() {
		System.out.println("sexo precisa ser F ou M:");
		return false;
	}
}

package Exercicios;

import java.util.Scanner;

public class Senhaa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean infoValidas = false;

		String nomeuser;
		String senha;

		do {
			System.out.println("Entre com o nome do usuario");
			nomeuser = scan.next();

			System.out.println("Entre com a senha");
			senha = scan.next();

			if (nomeuser.equalsIgnoreCase(senha)) {

				System.out.println("senha igual a usuario, digite novamente");

			} else {
				infoValidas = true;
				System.out.println("senha e usuario validos");
			}
		} while (!infoValidas);
	}
}

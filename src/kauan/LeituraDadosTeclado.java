package kauan;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

	    /* System.out.println("Digite seu nome completo: ");
		String NomeCompleto = scan.nextLine();
	    System.out.println("Seu nome completo:" + NomeCompleto);
	    
	    System.out.println ("Digite seu primeiro nome:");
	    String PrimeiroNome = scan.next();
	    System.out.println("Seu primeiro nome é:" + PrimeiroNome);
	    
	    System.out.println("Digite a Sua Idade:");
	    int Idade = scan.nextInt();
	    System.out.println("Sua Idade e:  " +Idade);
	     
	    System.out.println("Digite a Sua Altura:");
	    double Altura = scan.nextDouble();
	    System.out.println("Sua Altura e:  " +Altura); */
		
		System.out.println("digite o seu Primeiro nome, idade,  qtdade de filhos, altura , tem pet");
		String PriimeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
	    float altura = scan.nextFloat();
	    boolean teaPet = scan.nextBoolean();
	    
	    System.out.println("Primeiro nome: " +PriimeiroNome);
	    System.out.println("voce digitou Idade: " +idade);
	    System.out.println("voce digitou: " +qtdFilhos);
	    System.out.println("voce digitou: " +altura);
	    System.out.println("voce digitou: " +teaPet);
	    
	   
	   
	}

}

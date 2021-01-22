package Exercicios;

import java.util.Scanner;

public class exer14 {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o tamanho do arquivo");
		double tamanhoarquivo= scan.nextDouble();
 
        System.out.println ("entre com a velocidade da internet");
        double velinternet = scan.nextDouble();
        
        double tempo = tamanhoarquivo / velinternet;
        
        System.out.println("tempo de Download:" +tempo);
	
	}

}

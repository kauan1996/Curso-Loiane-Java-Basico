package Exercicios;

import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
	
			 Scanner scan = new Scanner (System.in);

				System.out.println ("insira um numero: "  );
			
				int nota1 = scan.nextInt();
				
				System.out.println ("insira um numero: "  );
				int nota2= scan.nextInt();
				
				System.out.println ("insira um numero: "  );
				int nota3= scan.nextInt();
				
				System.out.println ("insira um numero: "  );
				int nota4= scan.nextInt();
							
				
				int resultado = nota1 + nota2 + nota3 + nota4;
				
			
				
						
				System.out.println ("insira um numero: " +resultado/4 );
	}

}

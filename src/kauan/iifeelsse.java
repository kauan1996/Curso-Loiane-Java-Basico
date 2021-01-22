package kauan;


import java.util.Scanner;

public class iifeelsse {
		
	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("entre com sua idade");
		
		int idade = scan.nextInt();
		
		if (idade>= 18) {
			System.out.println ("é maior de idade: ");
			
		}else{ 
				System.out.println ("é menor de idade: ");
		}
	}
}


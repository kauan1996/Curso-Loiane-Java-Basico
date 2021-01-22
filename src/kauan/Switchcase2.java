package kauan;

import java.util.Scanner;

public class Switchcase2 {
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int diaSemana = scan.nextInt();
		
		
		switch(diaSemana){
		case 1: System.out.println ("domingo");break;
		case 2: System.out.println ("segunda");break;
		case 3: System.out.println ("terca");break;
		case 4: System.out.println ("quarta");break;
		case 5: System.out.println ("quinta");break;
		case 6: System.out.println ("sexta"); break;
		case 7: System.out.println ("sabado"); break;
		default: System.out.println ("nao e um dia da semana valido");
		

		}

	}

}

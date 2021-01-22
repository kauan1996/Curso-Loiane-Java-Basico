package kauan;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	 
	int diaSemana = scan.nextInt();
	
	if (diaSemana == 1) {
		
		System.out.println("domingo");
		
		
	} else if

       (diaSemana == 2) {
		
		System.out.println("Segunda");
	} else if

       (diaSemana == 3) {
		
		System.out.println("terça");
	} else if

       (diaSemana == 4) {
		
		System.out.println("quarta");
	} else if

       (diaSemana == 5) {
		
		System.out.println("quinta");
	} else if

       (diaSemana == 6) {
		
		System.out.println("sexta");
	} else if

       (diaSemana == 7) {
		
		System.out.println("sabado");
		
			} else { 
				System.out.println ("nao e um dia da semana, valido");
			}

	}
}
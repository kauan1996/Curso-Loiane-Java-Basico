package Exercicios;

public class Populacao {

	public static void main (String [] args) {
	
	int popA = 80000;
	int popB = 200000;
	int cont = 0;

	while (popA <popB){

		popA += (popA / 100) * 3;
		popB += (popB / 100) * 1.5;
		cont++;
	}

	System.out.println("a populaçao A: "+popA);

	System.out.println("a populaçao B: "+popB);

	System.out.println("QTD anos: "+cont);
    }
}

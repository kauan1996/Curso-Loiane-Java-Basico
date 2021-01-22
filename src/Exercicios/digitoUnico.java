package Exercicios;

import java.util.Scanner;

public class digitoUnico 
{
 
    public static void main(String[] args) {

    	Scanner scan = new Scanner (System.in);
    	
    	System.out.println("favor insira um numero");
    	
    	int numero = scan.nextInt();
    	
		       
    }
    
    public int somarDigito(String numero){
    	
        Integer soma = 0;
    	
    	for(int i = 0, len = numero.length(); i < len; i++ ) {
    		soma += Integer.parseInt(Character.toString(numero.charAt(i)));
    	}
		   	
    	return soma;
    	
    }
    
   
}

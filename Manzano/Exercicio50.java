package exercicios;

import java.util.Scanner;

public class Exercicio50 {
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  	System.out.println("Digite o valor que ser� dividido"); 
	        int valorUm = sc.nextInt(); 

	        System.out.println("Digite o valor que ser� o divisor"); 
	        int valorDois = sc.nextInt(); 

	        int i = 1, resultado = 0, mult = 0, cont = 0;
	        int validador = 0; 

	        do {

	            mult = valorDois * i; 
	            resultado = valorUm - mult; 


	            if(resultado < 0) {
	                validador = 1; 
	            } else {
	                cont ++; 
	                i++; 
	            }


	        }while(validador == 0); 

	        System.out.println("O n�mero quociente de divis�o � de: " + cont); 

	
	        sc.close();
	        }

}

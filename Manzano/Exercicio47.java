package exercicios;

import java.util.Scanner;

public class Exercicio47 {
	
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        int i = 0; 

	        do{
	            int acumuladores = 1;
	            int x = 1;

	                do{
	                    acumuladores = acumuladores * x;
	                    x++;
	                  
	                }while(x <= i);

	                System.out.println("O fatorial do valor " + i + " = " + acumuladores);

	            i++;
	        }while(i <= 10);

	        sc.close();

	}

}

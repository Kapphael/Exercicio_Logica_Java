package exercicios;

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main (String args []) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite os graus Fahrenheit: ");
		float f = sc.nextFloat();
		
		float c = (float) (5*(f-32)/9);
		
		System.out.println(c+"°C");
		
		sc.close();
	}

}

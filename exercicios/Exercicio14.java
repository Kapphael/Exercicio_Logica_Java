package exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main (String args []) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		if(numero>10) {
			System.out.println("É maior que 10");
			
		}else {
			System.out.println("É menor que 10");
		}
		sc.close();
	}
}

package exercicios;

import java.util.Scanner;


public class Exercicio33 {

	public static void main(String args[]) {
		int valor1, valor2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		valor1 = sc.nextInt();
		
		System.out.println("Digite outro numero: ");
		valor2 = sc.nextInt();
		
		if(valor1 == valor2) {
			System.out.print("Números iguais");
		}
		
		if(valor1 > valor2) {
			System.out.print("O primeiro valor é maior");
		}
		
		if(valor1 < valor2) {
			System.out.print("O segundo valor é maior");
		}
		
		sc.close();
	}

}

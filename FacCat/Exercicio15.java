package exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		if (numero>0) {
			System.out.println("Esse número é positivo.");
		}else {
			System.out.println("Esse número é negativo.");
		}
		sc.close();
	}
	
}

package exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero:");
		int numero = sc.nextInt();
		
		if (numero>0) {
			System.out.println("Esse n�mero � positivo.");
		}else {
			System.out.println("Esse n�mero � negativo.");
		}
		sc.close();
	}
	
}

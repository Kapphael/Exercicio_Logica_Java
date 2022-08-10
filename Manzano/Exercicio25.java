package exercicios;

import java.util.Scanner;

public class Exercicio25 {
	
	public static void main(String[] args) {
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		valor = sc.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("O valor " + valor + " É PAR!");
		}else {
			System.out.println("O valor " + valor + " É IMPAR!");
		}

		
		sc.close();
	}

}

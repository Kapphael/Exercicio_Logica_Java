package exercicios;

import java.util.Scanner;

public class Exercicio25 {
	
	public static void main(String[] args) {
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro: ");
		valor = sc.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("O valor " + valor + " � PAR!");
		}else {
			System.out.println("O valor " + valor + " � IMPAR!");
		}

		
		sc.close();
	}

}

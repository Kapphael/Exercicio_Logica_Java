package exercicios;

import java.util.Scanner;

public class Exercicio26 {
	
	public static void main(String[] args) {
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um  valor de 1 à 9");
		valor = sc.nextInt();
		
		if(valor >= 1 && valor <= 9) {
			System.out.println("O valor " + valor + " está na faixa permitida");
		}else {
			System.out.println("O valor " + valor + " está fora da faixa permitida");
		}
		
		

		sc.close();
	}

}

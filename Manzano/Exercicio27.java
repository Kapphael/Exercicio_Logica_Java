package exercicios;

import java.util.Scanner;

public class Exercicio27 {
	
	public static void main(String[] args) {
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um  número: ");
		valor = sc.nextInt();
		
		if(valor <= 3) {
			System.out.println(valor);
		} else {
			System.out.println("Valor incorreto");
		}

		sc.close();
	}

}

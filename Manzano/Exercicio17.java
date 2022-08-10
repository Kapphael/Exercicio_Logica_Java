package exercicios;

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main(String args[]) {
		int valor1, valor2, diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		valor2 = sc.nextInt();
		
		if(valor1 > valor2) {
			diferenca = valor1 - valor2;
		}else {
			diferenca = valor2 - valor1;
		}
		
		System.out.print("A diferenca do maior pelo menor é: " + diferenca);
		
		sc.close();
	}

}

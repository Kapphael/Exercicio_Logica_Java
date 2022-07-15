package exercicios;

import java.util.Scanner;

public class Exercicio29 {
	public static void main(String args[]) {
		int[] valores = new int[3];
		int soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1° valor: ");
		valores[0] = sc.nextInt();
		
		System.out.println("Digite o 2° valor: ");
		valores[1] = sc.nextInt();
		
		System.out.println("Digite o 3° valor: ");
		valores[2] = sc.nextInt();
		
		if(valores[0] > valores[1] && valores[1] > valores[2]) {
			soma = valores[0] + valores[1];
			System.out.println("A soma entre os maiores valores é: " + soma);
		}
		
		if(valores[0] > valores[2] && valores[2] > valores[1]) {
			soma = valores[0] + valores[2];
			System.out.println("A soma entre os maiores valores é: " + soma);
		}
		
		if(valores[1] > valores[0] && valores[0] > valores[2]) {
			soma = valores[1] + valores[0];
			System.out.println("A soma entre os maiores valores é: " + soma);
		}
		
		if(valores[1] > valores[2] && valores[2] > valores[0]) {
			soma = valores[1] + valores[2];
			System.out.println("A soma entre os maiores valores é: " + soma);
		}
		
		if(valores[2] > valores[0] && valores[0] > valores[1]) {
			soma = valores[2] + valores[0];
			System.out.println("A soma entre os maiores valores é: " + soma);
		}
		
		if(valores[2] > valores[1] && valores[1] > valores[0]) {
			soma = valores[2] + valores[1];
			System.out.println("A soma entre os maiores valores é: " + soma);
		}
		sc.close();
		
	}

}

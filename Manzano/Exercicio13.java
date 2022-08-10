package exercicios;

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main(String args[]) {
		int a, b, c, quad, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		a = sc.nextInt();
		
		System.out.println("Digite outro valor:");
		b = sc.nextInt();
		
		System.out.println("Digite o terceiro valor:");
		c = sc.nextInt();
		
		soma = a + b + c;
		quad = soma * soma;
		
		System.out.print("A quadrado da soma é: " + quad);
		
		
		sc.close();
	}

}

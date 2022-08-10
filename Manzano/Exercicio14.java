package exercicios;

import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String args[]) {
		int a, b, c, d, produto, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		c = sc.nextInt();
		
		System.out.println("Digite o quarto valor: ");
		d = sc.nextInt();
		
		produto = a * c;
		soma = b + d;
		
		System.out.println("O produto de " + a + " com " + c + " é: " + produto);
		System.out.println("A soma de " + b + " com " + d + " é: " + soma);
		
		
		sc.close();
		
	}

}

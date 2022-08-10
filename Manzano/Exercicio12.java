package exercicios;

import java.util.Scanner;

public class Exercicio12 {
	
	static public void main(String args[]) {
		int a, b, c, quadA, quadB, quadC, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		a = sc.nextInt();
		
		System.out.println("Digite outro valor:");
		b = sc.nextInt();
		
		System.out.println("Digite o terceiro valor:");
		c = sc.nextInt();
		
		quadA = a * a;
		quadB = b * b;
		quadC = c * c;
		
		soma = quadA + quadB + quadC;
		
		System.out.print("A soma dos quadrados é: " + soma);
		
		
		sc.close();
		
	}

}

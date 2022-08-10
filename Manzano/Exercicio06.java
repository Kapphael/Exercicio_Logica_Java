package exercicios;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String args[]) {
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da variavel A: ");
		a = sc.nextInt();
		
		System.out.println("Digite o valor da variavel B: ");
		b = sc.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("O valor de A é: " + a + " O valor de B é: " + b);
		
		sc.close();
	}

}

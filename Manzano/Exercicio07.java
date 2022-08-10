package exercicios;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String args[]) {
		int a, b, c, d, soma, mult;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro valor: ");
		a = sc.nextInt();
		
		System.out.println("Digite o valor do segundo valor: ");
		b = sc.nextInt();
		
		System.out.println("Digite o valor do terceiro valor: ");
		c = sc.nextInt();
		
		System.out.println("Digite o valor do quarto valor: ");
		d = sc.nextInt();
		
		soma = a + b;
		System.out.println("A soma entre: " + a + " e " + b + " é :" + soma );
		
		soma = a + c;
		System.out.println("A soma entre: " + a + " e " + c + " é :" + soma );
		
		soma = a + d;
		System.out.println("A soma entre: " + a + " e " + d + " é :" + soma );
		
		soma = b + c;
		System.out.println("A soma entre: " + b + " e " + c + " é :" + soma );
		
		soma = b + d;
		System.out.println("A soma entre: " + b + " e " + d + " é :" + soma );
		
		soma = c + d;
		System.out.println("A soma entre: " + c + " e " + d + " é :" + soma );
		
		
		mult = a * b;
		System.out.println("A Multiplicação entre: " + a + " e " + b + " é :" + mult );
		
		mult = a * c;
		System.out.println("A Multiplicação entre: " + a + " e " + c + " é :" + mult );
		
		mult = a * d;
		System.out.println("A Multiplicação entre: " + a + " e " + d + " é :" + mult );
		
		mult = b * c;
		System.out.println("A Multiplicação entre: " + b + " e " + c + " é :" + mult );
		
		mult = b * d;
		System.out.println("A Multiplicação entre: " + b + " e " + d + " é :" + mult );
		
		mult = c * d;
		System.out.println("A Multiplicação entre: " + c + " e " + d + " é :" + mult );
		
		
		sc.close();
	}

}

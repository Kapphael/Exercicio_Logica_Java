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
		System.out.println("A soma entre: " + a + " e " + b + " � :" + soma );
		
		soma = a + c;
		System.out.println("A soma entre: " + a + " e " + c + " � :" + soma );
		
		soma = a + d;
		System.out.println("A soma entre: " + a + " e " + d + " � :" + soma );
		
		soma = b + c;
		System.out.println("A soma entre: " + b + " e " + c + " � :" + soma );
		
		soma = b + d;
		System.out.println("A soma entre: " + b + " e " + d + " � :" + soma );
		
		soma = c + d;
		System.out.println("A soma entre: " + c + " e " + d + " � :" + soma );
		
		
		mult = a * b;
		System.out.println("A Multiplica��o entre: " + a + " e " + b + " � :" + mult );
		
		mult = a * c;
		System.out.println("A Multiplica��o entre: " + a + " e " + c + " � :" + mult );
		
		mult = a * d;
		System.out.println("A Multiplica��o entre: " + a + " e " + d + " � :" + mult );
		
		mult = b * c;
		System.out.println("A Multiplica��o entre: " + b + " e " + c + " � :" + mult );
		
		mult = b * d;
		System.out.println("A Multiplica��o entre: " + b + " e " + d + " � :" + mult );
		
		mult = c * d;
		System.out.println("A Multiplica��o entre: " + c + " e " + d + " � :" + mult );
		
		
		sc.close();
	}

}

package exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String args[]) {
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1° valor: ");
		a = sc.nextInt();
		
		System.out.println("Digite o 2° valor: ");
		b = sc.nextInt();
		
		System.out.println("Digite o 3° valor: ");
		c = sc.nextInt();
		
		if(a > b && b > c) {
			System.out.println("A ordem crescente é:" + a + "..." + b + "..." + c);
		}
		
		if(a > c && c > b) {
			System.out.println("A ordem crescente é:" + b + "..." + c + "..." + a);
		}
		
		if(b > a && a > c) {
			System.out.println("A ordem crescente é:" + c + "..." + a + "..." + b);
		}
		
		if(b > c && c > a) {
			System.out.println("A ordem crescente é:" + a + "..." + c + "..." + b);
		}
		
		if(c > a && a > b) {
			System.out.println("A ordem crescente é:" + b + "..." + a + "..." + c);
		}
		
		if(c > b && b > a) {
			System.out.println("A ordem crescente é:" + a + "..." + b + "..." + c);
		}
		
		sc.close();
	}
}

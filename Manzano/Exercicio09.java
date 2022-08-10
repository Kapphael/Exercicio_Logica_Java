package exercicios;

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String args[]) {
		int num1, num2, dif, quad;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		num2 = sc.nextInt();
		
		dif = num1 - num2;
		quad = dif * dif;
		
		System.out.print("O quadrado de " + dif + " é : " + quad);
		
		
		
		sc.close();
		
	}

}

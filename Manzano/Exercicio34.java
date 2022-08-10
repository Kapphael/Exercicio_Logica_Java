package exercicios;

import java.util.Scanner;

public class Exercicio34 {
	
	public static void main(String[] args) {
		int base, expo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		base = sc.nextInt();
		
		System.out.println("Digite o valor do expoente: ");
		expo = sc.nextInt();
		
		int i = 1;
		int pot = 1;
		
		while(i <= expo) {
		
			pot = pot * base;
			i++;
				
		}
		
		System.out.println(base + " ^ " + expo + " = " + pot);
		
		sc.close();

	}

}

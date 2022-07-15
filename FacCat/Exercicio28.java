package exercicios;

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String args[]) {
		int[] valores = new int[3];
		int maior;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1° valor: ");
		valores[0] = sc.nextInt();
		
		System.out.println("Digite o 2° valor: ");
		valores[1] = sc.nextInt();
		
		System.out.println("Digite o 3° valor: ");
		valores[2] = sc.nextInt();
		
		if(valores[0] > valores[1]) {
			maior = valores[0];
		}else {
			maior = valores[1];
		}
		
		if(valores[2] > maior) {
			maior = valores[2];
		}
		
		System.out.println("O maior valor digitado foi: " + maior);
		sc.close();
	}
	
}

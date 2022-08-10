package exercicios;

import java.util.Scanner;

public class Exercicio49 {
	
	public static void main(String[] args) {
		int menor = 0, maior = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		do {
			System.out.println("Digite um numero: ");
			int numAtual = sc.nextInt();
			
			
			if(numAtual > 0 ) {
				if(numAtual > maior) {
					maior = numAtual;
					
				}else if(numAtual < menor) {
					menor = numAtual;
				}
			}else {
				i = 0;
			}
			
			
		}while(i > 0);
		
		System.out.println("O maior numero digitado foi: " + maior);
		System.out.println("O menor numero digitado foi: " + menor);
		
sc.close();
	}

}

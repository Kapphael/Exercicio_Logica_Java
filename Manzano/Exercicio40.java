package exercicios;

import java.util.Scanner;

public class Exercicio40 {
	
	public static void main(String[] args) {
		int numero = 0;
		int maior = 0;
		int menor = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(numero >= 0) {
			System.out.println("Digite um numero POSITIVO para continuar ou NEGATIVO para encerrar: ");
			numero = sc.nextInt();
			
			if(numero > 0) {
				if(numero > maior) {
					maior = numero;
				}else if (numero < menor) {
					menor = numero;
				}
			}else {
				menor = numero;
			}
			
		}
		
		System.out.println("O maior número digitado foi: "+ maior);
		System.out.println("O menor número digitado foi: "+ menor);
		
		sc.close();

	}

}

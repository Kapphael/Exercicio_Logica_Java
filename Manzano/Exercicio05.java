package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String args[]) {
		float valor, taxa, prestacao; 
		int tempo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos porcento de taxa est� sendo cobrado?: ");
		taxa = sc.nextFloat();
		
		System.out.println("Informe o valor da presta��o atrasada: ");
		valor = sc.nextFloat();
		
		System.out.print("A quanto tempo a presta��o est� atrasada: ");
		tempo = sc.nextInt();
		
		prestacao = valor + ( valor * taxa / 100) * tempo;
		System.out.print("O valor atual a ser pago �: " + prestacao);
		
		
		sc.close();
	}

}

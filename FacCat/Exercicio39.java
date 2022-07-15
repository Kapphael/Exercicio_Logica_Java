package exercicios;

import java.util.Scanner;

public class Exercicio39 {
	
	public static void main(String args[]) {
		float[] notas = new float[4];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da primeira avaliação: ");
		notas[0] = sc.nextFloat();
		
		System.out.println("Digite o valor da segunda avaliação: ");
		notas[1] = sc.nextFloat();
		
		System.out.println("Digite o valor da terceira avaliação: ");
		notas[2] = sc.nextFloat();
		
		System.out.println("Digite a media da recuperação: ");
		notas[3] = sc.nextFloat();
		
		float media = (notas[0] + (notas[1]*2) + (notas[2]*3) + notas[3]) / 7;
		
		if(media >= 9) {
			System.out.println("Conceito A");
			
		}else if(media >= 7.5 && media < 9) {
			System.out.println("Conceito B");
			
		}else if(media >= 6.0 && media < 7.5) {
			System.out.println("Conceito C");
			
		}else if(media < 6) {
			System.out.println("Conceito D");
		}
		
		sc.close();
	}

}

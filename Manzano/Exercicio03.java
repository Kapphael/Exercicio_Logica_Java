package exercicios;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String Args[]) {
		float pi = 3.14159f;
		float volume, raio, altura;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		altura = sc.nextFloat();
		
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextFloat();
		
		volume = pi * (raio * raio) * altura;
		System.out.print("O volume é: " + volume);
		
		sc.close();
	}

}

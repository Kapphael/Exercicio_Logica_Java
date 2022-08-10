package exercicios;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String args[]) {
		int comprimento, largura, altura, volume;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura: ");
		largura = sc.nextInt();
		
		System.out.println("Digite a altura: ");
		altura = sc.nextInt();
		
		System.out.println("Digite o valor do comprimento: ");
		comprimento = sc.nextInt();
		
		volume = comprimento * largura * altura;
		
		System.out.print("O volume da caixa é: " + volume);
		
		sc.close();
		
	}


}

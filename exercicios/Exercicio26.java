package exercicios;

import java.util.Scanner;

public class Exercicio26 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade em estoque: ");
		int qntEstoque= sc.nextInt();
		
		System.out.println("Digite a quantidade m�xima em estoque: ");
		int qntMaxima= sc.nextInt();
		
		System.out.println("Digite a quantidade minima em estoque: ");
		int qntMinima= sc.nextInt();
		
	
		
		float media=(qntMaxima+qntMinima)/2;
		
		System.out.println("M�dia: "+media);
		
		if (qntEstoque>=media) {
			
			System.out.println("N�o efetuar compra.");
		}else {
			
			
			System.out.println("Efetuar compra.");
		}
		sc.close();		
	}

}

package exercicios;

import java.util.Scanner;

public class Exercicio58 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultado = 1, contadora;

		System.out.println("Digite o valor da Base: ");
		int b = sc.nextInt();

		System.out.println("Digite o valor do expoente: ");
		int ex = sc.nextInt();

		for (contadora = 1; contadora <= ex; contadora++) {
			resultado = resultado * b;
		}
		
		System.out.println(b+" ^ "+ (contadora-1) +" = "+ resultado);

		sc.close();
	}
	

}

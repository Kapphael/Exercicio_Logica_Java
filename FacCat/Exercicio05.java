package exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero ");
		int numero = sc.nextInt();


		int resultado = numero-1;

		System.out.println("O numero antecessor ao seu numero é "+resultado);
		sc.close();
		}
}

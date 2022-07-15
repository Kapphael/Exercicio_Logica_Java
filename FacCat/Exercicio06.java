package exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho da base do seu retangulo em cm ");
		int base = sc.nextInt();

		System.out.println("Digite o tamanho da altura do seu retangulo em cm ");
		int altura = sc.nextInt();

		int area = base*altura;

		System.out.println("O tamanho da area do seu retangulo é "+area+"cm²");
		sc.close();
		}
}

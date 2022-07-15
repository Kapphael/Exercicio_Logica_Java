package exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos anos você tem ? ");
		int anos = sc.nextInt();

		System.out.println("Quantos meses passou desde seu aniversario ? ");
		int meses = sc.nextInt();

		System.out.println("Quantos dias passou desde seu mesversario ? ");
		int dias = sc.nextInt();

		int diasDeVida = anos*365+meses*30+dias;

		System.out.println("Você tem "+diasDeVida+" dias de vida.");
		sc.close();
		}
}

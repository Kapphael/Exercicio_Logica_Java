package exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a nota da primeira avalia��o: ");
		float n1 = sc.nextFloat();
		System.out.println("Digite a nota da segunda avalia��o: ");
		float n2 = sc.nextFloat();
		
		float media = (float) (n1+n2)/2;
		
		if (media>=6) {
			System.out.println("O aluno foi aprovado com a m�dia: "+media);
		}else {
			System.out.println("O aluno foi reprovado com a m�dia: "+media);
		}
		sc.close();
	}

}

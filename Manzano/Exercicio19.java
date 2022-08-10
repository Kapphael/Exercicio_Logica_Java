package exercicios;

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String args[]) {
		int n1, n2, n3, n4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a nota da 1° avaliação: ");
		n1 = sc.nextInt();
		
		System.out.println("Informe a nota da 2° avaliação: ");
		n2 = sc.nextInt();
		
		System.out.println("Informe a nota da 3° avaliação: ");
		n3 = sc.nextInt();
		
		System.out.println("Informe a nota da 4° avaliação: ");
		n4 = sc.nextInt();
		
		int media = (n1 + n2 + n3 + n4) / 4;
		
		if(media >= 5) {
			System.out.println("A media do aluno foi: " + media + " APROVADO");
		}else {
			System.out.println("A media do aluno foi: " + media + " REPROVADO");
		}
		
		sc.close();
	}


}

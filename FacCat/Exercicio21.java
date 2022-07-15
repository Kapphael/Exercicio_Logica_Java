package exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o horário de inicio: ");
		float inicial = sc.nextFloat();
		
		System.out.println("Digite o horário do fim: ");
		float fim = sc.nextFloat();
		
		float total = (float)(fim-inicial);
		
		if (total>0) {
			System.out.println("A partida de Xadrez durou: "+total);
		}else {
			float af = (total+24);
			System.out.println("A partida de Xadrez durou: "+af);
		}
		sc.close();
	}

}

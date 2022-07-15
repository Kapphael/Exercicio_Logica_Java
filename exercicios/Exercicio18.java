package exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o ano atual: ");
		int anoA = sc.nextInt();
		
		System.out.println("Digite o ano em que você nasceu: ");
		int nasc = sc.nextInt();
		
		int idade = (int)(anoA-nasc);
		
		if (idade>=16) {
			System.out.println(idade+" é suficiente para votar!");
		}else {
			System.out.println(idade+" é insuficiente para votar!");
		}
		sc.close();
	}

}

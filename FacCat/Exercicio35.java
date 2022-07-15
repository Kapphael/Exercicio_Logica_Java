package exercicios;

import java.util.Scanner;

public class Exercicio35 {
	public static void main(String args[]) {
		int homemUm, homemDois, mulherUm, mulherDois, soma, produto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idade do primeiro homem");
		homemUm = sc.nextInt();
		
		System.out.println("Digite a idade do segundo homem");
		homemDois = sc.nextInt();
		
		System.out.println("Digite a idade do primeiro mulher");
		mulherUm = sc.nextInt();
		
		System.out.println("Digite a idade do segundo mulher");
		mulherDois = sc.nextInt();
		
		if(homemUm > homemDois && mulherUm > mulherDois) {
			soma = homemUm + mulherDois;
			produto = homemDois * mulherUm;
			
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma +
								"\n O produto do homem mais novo com a mulher mais velha é: " + produto);
		}
		
		if(homemUm > homemDois && mulherDois > mulherUm) {
			soma = homemUm + mulherUm;
			produto = homemDois * mulherDois;
			
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma +
								"\n O produto do homem mais novo com a mulher mais velha é: " + produto);
		}
		
		if(homemDois > homemUm && mulherUm > mulherDois) {
			soma = homemDois + mulherDois;
			produto = homemUm * mulherUm;
			
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma +
								"\n O produto do homem mais novo com a mulher mais velha é: " + produto);
		}
		
		if(homemUm > homemDois && mulherUm > mulherDois) {
			soma = homemDois + mulherUm;
			produto = homemUm * mulherDois;
			
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma +
								"\n O produto do homem mais novo com a mulher mais velha é: " + produto);
		}
		
		sc.close();
		
	}

}

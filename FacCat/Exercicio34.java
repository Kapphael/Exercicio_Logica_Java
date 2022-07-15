package exercicios;

import java.util.Scanner;

public class Exercicio34 {
	public static void main(String args[]) {
		String tipo;
		int qtdAbastecida;
		float total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha o combustível: [A]-Álcool | [G]-Gasolina: ");
		tipo = sc.next().toUpperCase();
		
		System.out.println("Quantidade em litros abastecido: ");
		qtdAbastecida = sc.nextInt();
		
		//Alcool
		if(tipo.equals("A")) {
			if(qtdAbastecida <= 20) {
				total = (float) 2.9 * (qtdAbastecida - (qtdAbastecida * 3/100));
				System.out.println("O valor com desconto será: R$" + total);
				
			}else {
				total = (float) 2.9 * (qtdAbastecida - qtdAbastecida * 5/100);
				System.out.println("O valor com desconto será: R$" + total);
			}
		}
		
		//Gasolina 
		if(tipo.equals("G")) {
			if(qtdAbastecida <= 20) {
				total = (float) 3.3 * (qtdAbastecida - qtdAbastecida * 4/100);
				System.out.println("O valor com desconto será: R$" + total);
				
			}else {
				total = (float) 3.3 * (qtdAbastecida - qtdAbastecida * 6/100);
				System.out.println("O valor com desconto será: R$" + total);
					
			}
			
		}
		

		
	}

}

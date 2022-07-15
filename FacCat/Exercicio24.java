package exercicios;

import java.util.Scanner;

public class Exercicio24 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário fixo: ");
		float salFixo= sc.nextFloat();
		
		System.out.println("Digite o valor das vendas: ");
		float vendas= sc.nextFloat();
		
		if (vendas>1500) {
			float vendasExtra = vendas-1500;
			float extra1 = (float) (vendasExtra*0.05);
			float extra2 = (float) (1500*0.03);
			float total = salFixo+extra1+extra2;
			
			System.out.println("Seu salário total é de: R$"+total);
		}else {
			float extra2 = (float) (vendas*0.03);
			float total = salFixo+extra2;
			
			System.out.println("Seu salário é de: R$"+total);
		}
		sc.close();		
	}

}

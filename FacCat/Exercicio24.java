package exercicios;

import java.util.Scanner;

public class Exercicio24 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu sal�rio fixo: ");
		float salFixo= sc.nextFloat();
		
		System.out.println("Digite o valor das vendas: ");
		float vendas= sc.nextFloat();
		
		if (vendas>1500) {
			float vendasExtra = vendas-1500;
			float extra1 = (float) (vendasExtra*0.05);
			float extra2 = (float) (1500*0.03);
			float total = salFixo+extra1+extra2;
			
			System.out.println("Seu sal�rio total � de: R$"+total);
		}else {
			float extra2 = (float) (vendas*0.03);
			float total = salFixo+extra2;
			
			System.out.println("Seu sal�rio � de: R$"+total);
		}
		sc.close();		
	}

}

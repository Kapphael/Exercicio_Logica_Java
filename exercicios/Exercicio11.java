package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String args []) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de carros vendidos: ");
		int carrosVendidos = sc.nextInt(); 
		
		System.out.println("Digite o valor total de suas vendas: ");
		float totalVendas = sc.nextFloat();
		
		System.out.println("Digite o seu sal�rio fixo: ");
		float salario = sc.nextFloat();
		
		System.out.println("Digite o valor fixo da comiss�o por carros vendidos: ");
		float valorCarrosVendidos = sc.nextFloat();
		
		float comissao = (float) (carrosVendidos*valorCarrosVendidos);
		float extraVendidos =(float) (totalVendas*0.05);
		float salarioFinal = (float) (salario+comissao+extraVendidos);
		
		System.out.println("Valor sal�rio final �: R$"+salarioFinal);
		sc.close();
	}

}

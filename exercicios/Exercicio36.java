package exercicios;

import java.util.Scanner;

public class Exercicio36 {
	
	public static void main(String args[]) {
		int morango, maca;
		
		double totalMorango, totalMaca, totalCompra, valorFinal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em Kg de morangos comprados: ");
		morango = sc.nextInt();
		
		System.out.println("Digite o valor em Kg de maças compradas: ");
		maca = sc.nextInt();
		
		double totalKg = morango + maca;
		
		//Calculo valor pago pelo morango
		if(morango <= 5) {
			totalMorango =  morango * 2.5;
		} else {
			totalMorango = morango * 2.2;
		}
		
		//Calculo valor pago pelo macas
		if(maca <= 5) {
			totalMaca = maca * 1.8;
		}else {
			totalMaca = maca * 1.5;
		}
		
		totalCompra = totalMorango + totalMaca;
		
		if(totalKg > 8 || totalCompra > 15) {
			valorFinal = totalCompra - (totalCompra * 10/100);
			System.out.println("O valor total que o cliente irá pagar é: R$" + valorFinal);
		}else {
			System.out.println("O valor total que o cliente irá pagar é: R$" + totalCompra);
		}
		
		sc.close();
	}

}

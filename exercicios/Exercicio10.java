package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do custo de fabrica do ve�culo: ");
		float custoFabrica = sc.nextFloat();
		
		float distribuidor = (float) (custoFabrica*0.28);
		float impostos = (float) (custoFabrica*0.48);
		float valorTotal = custoFabrica+impostos+distribuidor;
		
		System.out.println("O valor dos impostos �: "+impostos);
		System.out.println("O valor do distribuidor �: "+distribuidor);
		System.out.println("O valor total do ve�culo �: "+valorTotal);
		
		sc.close();
	}

}

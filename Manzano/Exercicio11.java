package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String args[]) {
		float dolarHoje, dolar, real;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cota��o atual do dolar: ");
		dolarHoje = sc.nextFloat();
		
		System.out.println("Informe a quantidade em Real que ser� convertido: ");
		real = sc.nextFloat();
		
		dolar = real / dolarHoje;
		
		System.out.print("R$" + real + " em real �: " + dolar + "$");
		
		
		sc.close();
	}

}

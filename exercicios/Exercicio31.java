package exercicios;

import java.util.Scanner;

public class Exercicio31 {
	public static void main(String args[]) {
		int ladoA, ladoB, ladoC;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de um lado do tri�ngulo: ");
		ladoA = sc.nextInt();
		
		System.out.println("Informe o valor do segundo lado do tri�ngulo: ");
		ladoB = sc.nextInt();
		
		System.out.println("Informe o valor do terceiro lado do tri�ngulo: ");
		ladoC = sc.nextInt();
		
		if((ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB)) {
			System.out.print("Esses valores foram um tri�ngulo");
			
		}else {
			System.out.print("Esses valores n�o formam um tri�ngulo");
		}
	sc.close();	
	}

}

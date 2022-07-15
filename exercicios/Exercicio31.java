package exercicios;

import java.util.Scanner;

public class Exercicio31 {
	public static void main(String args[]) {
		int ladoA, ladoB, ladoC;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de um lado do triângulo: ");
		ladoA = sc.nextInt();
		
		System.out.println("Informe o valor do segundo lado do triângulo: ");
		ladoB = sc.nextInt();
		
		System.out.println("Informe o valor do terceiro lado do triângulo: ");
		ladoC = sc.nextInt();
		
		if((ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB)) {
			System.out.print("Esses valores foram um triângulo");
			
		}else {
			System.out.print("Esses valores não formam um triângulo");
		}
	sc.close();	
	}

}

package exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o número de maças: ");
		int maca = sc.nextInt();
		
		if(maca>=12) {
			System.out.println("Total a pagar: R$"+maca);
		}else {
			System.out.println("Total a pagar: R$"+maca*1.30);
		}
		sc.close();
	}

}

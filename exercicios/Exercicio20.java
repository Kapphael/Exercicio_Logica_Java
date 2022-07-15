package exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite outro número: ");
		int num2 = sc.nextInt();
		
		if (num1<num2) {
			System.out.println(num1+","+num2);
			
		}else {
			System.out.println(num2+","+num1);
		}
		sc.close();
	}

}

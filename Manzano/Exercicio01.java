package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String args[]) {
		float fahr, celsius;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em graus celsius");
		celsius = sc.nextFloat();
		
		fahr =  (9 * celsius + 160) / 5;
		System.out.print(celsius + " em Fahrenheit é : " + fahr );
		
	
		sc.close();
	}

}

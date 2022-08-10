package exercicios;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String args[]) {
		float SM, PR, NS;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario mensal: ");
		SM = sc.nextFloat();
		
		System.out.println("Digite o percentual de reajuste ");
		PR = sc.nextFloat();
		PR = PR / 100;
		
		NS = SM + (SM * PR);
		
		System.out.print("O novo salario será: R$"+ NS);
		
		sc.close();
	}

}

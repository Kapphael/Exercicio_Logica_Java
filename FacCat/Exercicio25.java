package exercicios;

import java.util.Scanner;

public class Exercicio25 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero da conta: ");
		int conta= sc.nextInt();
		
		System.out.println("Digite o seu saldo: ");
		float saldo= sc.nextFloat();
		
		System.out.println("Digite o d�bito: ");
		float debito= sc.nextFloat();
		
		System.out.println("Digite o cr�dito: ");
		float credito= sc.nextFloat();
		
		float saldoAtual=saldo-debito+credito;
		
		System.out.println("Cliente da conta: "+conta+". Saldo atual: R$"+saldoAtual);
		
		if (saldoAtual<0) {
			
			System.out.println("Saldo Negativo");
		}else {
			
			
			System.out.println("Saldo Positvio");
		}
		sc.close();		
	}

}



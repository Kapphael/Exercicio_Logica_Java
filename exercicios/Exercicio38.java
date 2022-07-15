package exercicios;

import java.util.Scanner;

public class Exercicio38 {
	
	public static void main(String args[]) {
		String nomeProduto;
		double valorUnitario, qtdComprada, total, valorComDesconto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a descrição do produto (Nome): ");
		nomeProduto = sc.next();
		
		System.out.println("Digite o preço untário do produto: ");
		valorUnitario = sc.nextInt();
		
		System.out.println("Quantidade aquirada: ");
		qtdComprada = sc.nextInt();
		
		total = valorUnitario + qtdComprada;
		
		if(qtdComprada <= 5) {
			valorComDesconto = total - (total * 2/100);
			System.out.println("O preço do produto " + nomeProduto + " será: R$" + valorComDesconto);
		}
		
		if(qtdComprada > 5 && qtdComprada <= 10) {
			valorComDesconto = total - (total * 3/100);
			System.out.println("O preço do produto " + nomeProduto + " será: R$" + valorComDesconto);
		}
		
		if(qtdComprada > 10) {
			valorComDesconto = total - (total * 5/100);
			System.out.println("O preço do produto " + nomeProduto + " será: R$" + valorComDesconto);
		}
		
		
		
		sc.close();
			
	}

}

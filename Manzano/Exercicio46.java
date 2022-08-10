package exercicios;

import java.util.*;

public class Exercicio46 {
	
	public static void main(String[] args) {
		ArrayList <Integer> valor = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		do {
			System.out.println("Digite um valor: ");
			int valorAtual = sc.nextInt();

			if(valorAtual > 0 ) {
				valor.add(valorAtual);
				i++;
			}else {
				i = 0;
			}
			
			
		}while(i > 0);
		
		
		int soma = 0, media = 0, totalValores = 0;
		
		int n = 0;
		do {
			soma += valor.get(n);
			n++;
			
		}while(n < valor.size()); 
		
		media = soma / valor.size();
		
		System.out.println("A soma dos valores digitados é: " + soma);
		System.out.println("A media dos valores digitados é: " + media);
		System.out.println("Foram digitados " + valor.size() + " valores ");
		
		sc.close();
		

	}

}

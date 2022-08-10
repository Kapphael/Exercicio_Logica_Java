package exercicios;

import java.util.*;

public class Exercicio45 {
	
	public static void main(String[] args) {
		ArrayList <Integer> valor = new ArrayList<Integer>();
		int acumulador = 1;
		int acumulador2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		do {
			System.out.println("Digite o " + i + "°" + "valor: ");
			int valorAtual = sc.nextInt();
			valor.add(valorAtual);
			
			int n = valorAtual;
			
			do {
				acumulador = acumulador * n;
				
				if(n == 1) {
					acumulador2 += acumulador;
					acumulador = 1;
					
					
				}
				
				n--;
			}while(n >= 1);
			

			i++;
		}while(i <= 15);
		
		System.out.print("A soma total dos fatoriais foi de : "  + acumulador2);
		
		
		sc.close();

	}

}

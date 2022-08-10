package exercicios;

import java.util.*;

public class Exercicio24 {
	
	public static void main(String[] args) {
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int menor = 0; 
		int maior = 0;
	
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Digite o " + i + " valor: ");
			int valor = sc.nextInt();
			valores.add(valor);
		}
		
		System.out.println(valores);
		
		for(int i = 0; i < valores.size(); i++) {
			menor = valores.get(0);

			if(maior < valores.get(i)) {
				maior = valores.get(i);
			}
			
			if(menor > valores.get(i)) {
				menor = valores.get(i);
			}
		}
		
		System.out.println("O maior valor digitado foi:" + maior + "\nO menor valor digitado foi: " + menor);
		
		sc.close();
		
	}

}

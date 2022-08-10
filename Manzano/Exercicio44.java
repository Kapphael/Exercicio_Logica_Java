package exercicios;

public class Exercicio44 {
	
	public static void main(String[] args) {
		int soma = 0;
		int grao = 1;
		
		int i = 1;
		
		do {
			grao *= 2;
			soma += grao;
			
			System.out.println(i + "A soma dos grãos de trigo  em um tabuleiro é: " + soma);
			i++;

		}while(i < 64);
		
	}


}

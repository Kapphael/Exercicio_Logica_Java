package exercicios;

public class Exercicio54 {
	
	public static void main(String[] args) {
		int soma = 0;
		
		for(int i = 1; i<= 500; i++) {
			if(i % 2 == 0) {
				soma += i;
			}
		};
		
		System.out.print("A soma dos valores pares de 1 a 500 é: " + soma);

	}

}

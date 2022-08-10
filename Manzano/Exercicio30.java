package exercicios;

public class Exercicio30 {
	
	public static void main(String[] args) {
		int cont = 1;
		int soma = 0;
		
		while(cont <= 100) {
			soma += cont;
			cont++;
		}
		
		System.out.println("A soma entre os 100 primeiros numeros inteiros: " + soma);
		
	}

}

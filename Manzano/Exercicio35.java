package exercicios;

public class Exercicio35 {
	
	public static void main(String[] args) {
		int cont = 1;
		int anterior = 0;
		int atual = 0;
		int proximo = 1;
		
		while(cont <= 15) {
			anterior = atual;
			atual = proximo;
			proximo = atual + anterior;
			
			cont++;
			System.out.println(atual);
		}
		

	}

}

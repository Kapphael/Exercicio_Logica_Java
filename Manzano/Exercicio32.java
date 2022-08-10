package exercicios;

public class Exercicio32 {
	
	public static void main(String[] args) {
		int cont = 0;
		System.out.println("Os numeros inteiros ímpares na faixa de 0 a 20");
		
		while(cont <= 20) {
			if(cont % 2 == 1) {
				System.out.println(cont);
			}
			
			cont++;
		}

	}

}

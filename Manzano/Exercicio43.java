package exercicios;

public class Exercicio43 {
	
	public static void main(String[] args) {
		int i = 1;
		
		do {
			if(i % 4 == 0) {
				System.out.println("O numero " + i + " é divisivel por 4");
			}
			
			i++;
			
		}while(i <= 200);

	}

}

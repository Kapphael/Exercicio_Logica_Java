package exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as horas trabalhadas: ");
		float hrsTrab = sc.nextFloat();
		
		System.out.println("Digite o sal�rio por hora: ");
		float salHora = sc.nextFloat();
		
		if (hrsTrab>160) {
			float hrExtra = hrsTrab-160;
			float salExtra = (float) ((hrExtra*salHora)*0.5);
			float salTotal = salHora*hrsTrab+salExtra;
			System.out.println("Sal�rio total �: R$"+salTotal);
		}else {
			float salTotal = salHora*hrsTrab;
			System.out.println("Sal�rio total �: R$"+salTotal);
		}
		sc.close();
	}

}

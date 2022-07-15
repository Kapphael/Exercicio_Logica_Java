package exercicios;

import java.util.Scanner;

public class Exercicio40 {
	
	public static void main(String args[]) {
		int idade, anosTrabalhados;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();
		
		System.out.println("Digite seus anos trabalhados: ");
		anosTrabalhados = sc.nextInt();
		
		if(idade >= 65) {
			System.out.println("Requerer aposentadoria!");
					
		}else if(anosTrabalhados >= 30) {
			System.out.println("Requerer aposentadoria!");
			
		}else if(idade >= 60 && anosTrabalhados >=25 ) {
			System.out.println("Requerer aposentadoria!");
		}else {
			System.out.println("Você ainda não pode se aposentar");
		}
		sc.close();
	}

}

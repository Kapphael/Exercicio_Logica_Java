package exercicios;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String args[]) {
		String nome, sexo;
		float altura, pesoIdeal;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Informe o sexo: [M] - Masculino | [F] - Feminino");
		sexo = sc.next();
		sexo = sexo.toUpperCase();
		
		System.out.println("Informe sua altura");
		altura = sc.nextFloat();
		
		System.out.println(nome);
		System.out.println(sexo);
		System.out.println(altura);
		
		if(sexo == "M") {
			pesoIdeal = (float) ((72 * altura) - 58);
			System.out.println(nome + " Seu Peso ideial é: " + pesoIdeal + "Kg");
			
		}else {
			pesoIdeal = (float) ((62.1 * altura) - 44.7);
			System.out.println(nome + " Seu Peso ideal é: " + pesoIdeal + "Kg");
		}
		
		sc.close();
		
			
	}
}

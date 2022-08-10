package exercicios;

import java.util.Scanner;

public class Exercicio28 {
	
	public static void main(String args[]) {
		String nome, genero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Qual seu genero? [M] - Masculino | [F] - Feminino");
		genero = sc.next().toUpperCase();
		
		
		if(genero.equals("M")) {
			System.out.println("Ilustríssimo senhor " + nome);
		}
		
		if(genero.equals("F")) {
			System.out.println("Ilustríssima senhora " + nome);
		}
		
		
		
		sc.close();
	}

}

package exercicios;

import java.util.Scanner;

public class Exercicio37 {
	
	public static void main(String args[]) {
		int[] bancoDeDados = new int[2];
		bancoDeDados[0] = 1234;
		bancoDeDados[1] = 9999;
		
		int usuario, senha;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo de usuário: ");
		usuario = sc.nextInt();
		
		if(usuario != bancoDeDados[0]) {
			System.out.println("{Error} Usuario inválido, tente novamente!");
			
		}else if(usuario == bancoDeDados[0]) {
			System.out.println(" Digite sua senha: ");
			senha = sc.nextInt();
			
			if(senha != bancoDeDados[1]) {
				System.out.println("{Error} senha inválida, tente novamente!");
				
			}else if(senha == bancoDeDados[1]) {
				System.out.println("Acesso permitido! seja bem vindo");
			}
		}
		
		sc.close();
	}

}

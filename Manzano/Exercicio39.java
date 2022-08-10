package exercicios;

import java.util.Scanner;

public class Exercicio39 {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int area = 0, largura = 0, comprimento = 0; 
	        String resposta;
	        String nomeComodo; 

	        int i = 1;
	        while(i <= 1) {
	            System.out.println("Digite o nome do cômodo"); 
	            nomeComodo = sc.next(); 

	            System.out.println("Digite a largura do cômodo"); 
	            largura = sc.nextInt(); 

	            System.out.println("Digite o comprimento do cômodo"); 
	            comprimento = sc.nextInt(); 

	            area = largura * comprimento;

	            System.out.println("Deseja continuar ? SIM ou NÃO");
	            resposta = sc.next().toUpperCase();

	            System.out.println("Essa foi sua resposta: " + resposta); 

	            if(resposta.equals("NÃO")) {
	                i = 2; 
	            }

	        }

	        System.out.println("A área total da residência é igual a " + area); 


	        sc.close();
	    }


}

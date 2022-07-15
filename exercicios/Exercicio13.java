package exercicios;

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main (String args []) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite sua primeira nota: ");
	float nota1 = sc.nextFloat();
	System.out.println("Digite sua segunda nota: ");
	float nota2 = sc.nextFloat();
	System.out.println("Digite sua terceira nota: ");
	float nota3 = sc.nextFloat();
	
	float media = (float) ((nota1*2+nota2*3+nota3*5)/10);
	
	System.out.println("Média final: "+media);
	sc.close();
	
	}
}

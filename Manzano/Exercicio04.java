package exercicios;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String args[]) {
		int tempoGasto, velMedia, kml, distancia, litros;
		kml = 12;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tempo gasto na viagem: ");
		tempoGasto = sc.nextInt();
		
		System.out.println("Digite a velocidade media durante a viagem: ");
		velMedia = sc.nextInt();
		
		distancia = tempoGasto * velMedia;
		litros = distancia / kml;
		
		System.out.println("A velocidade média durante a viagem foi: " + velMedia);
		System.out.println("A tempo gasto durante a viagem foi: " + tempoGasto);
		System.out.println("A distancia percorrida foi de :" + distancia);
		System.out.print("A quantidade de combustível gasto foi: " + litros);
		
		
		sc.close();
		
	
	}

}

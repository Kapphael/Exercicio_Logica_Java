package exercicios;

import java.util.Scanner;

public class Exercicio32 {
	public static void main(String args[]) {
		String time1, time2;
		int  golTime1, golTime2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do primeiro time: ");
		time1 = sc.next();
		
		System.out.println("Quantidade de gols marcados pelo " + time1);
		golTime1 = sc.nextInt();
		
		System.out.println("Informe o nome do segundo time: ");
		time2 = sc.next();
		
		System.out.println("Quantidade de gols marcados pelo " + time2);
		golTime2 = sc.nextInt();
		
		if(golTime1 == golTime2) {
			System.out.print("A quantidade de gols marcados foram iguas. EMPATE");
		}
		
		if(golTime1 > golTime2) {
			System.out.println("O time " + time1 + " Foi o VENCEDOR");
			System.out.print("Resultado: " + time1 + " " + golTime1 + " x " + time2 + " " + golTime2);
		}
		
		if(golTime1 < golTime2) {
			System.out.println("O time " + time2 + " Foi o VENCEDOR");
			System.out.print("Resultado: " + time2 + " " + golTime2 + " x " + time1 + " " + golTime1);
		}
	sc.close();	
	}

}

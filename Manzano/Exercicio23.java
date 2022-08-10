package exercicios;

import java.util.*;

public class Exercicio23 {
	
	public static void main(String[] args) {
		int num1, num2, num3, num4;
		ArrayList<Integer> div = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o 1° valor: ");
		num1 = sc.nextInt();
		
		System.out.println("Informe o 2° valor: ");
		num2 = sc.nextInt();
		
		System.out.println("Informe o 3° valor: ");
		num3 = sc.nextInt();
		
		System.out.println("Informe o 4° valor: ");
		num4 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			div.add(num1);
		}
		
		if(num2 % 2 == 0) {
			div.add(num2);
		}
		
		if(num3 % 2 == 0) {
			div.add(num3);
		}
		
		if(num4 % 2 == 0) {
			div.add(num4);
		}
		
		System.out.print("Os numeros + " + div + " são divisiveis por 2.");
		
		sc.close();
		
		
		
	}

}

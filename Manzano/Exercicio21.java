package exercicios;

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main(String[] args) {
		double a, b, c, x1, x2, delta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor de A: ");
		a = sc.nextFloat();
		
		System.out.println("Valor de B: ");
		b = sc.nextFloat();
		
		System.out.println("Valor de C: ");
		c = sc.nextFloat();
		
		delta = (b * b) - (4 * a * c);
		
		if(delta < 0) {
			System.out.println("Essa equação não possui valores reias!");
		}else if(delta == 0) {
			x1 = -b / (2 * a);
			System.out.println("X = " + x1);
		} else {
			System.out.println(delta);
			x1 = -b + Math.sqrt(delta) / (2 * a);
			x2 = -b - Math.sqrt(delta) / (2 * a);
			
			System.out.println("X1 = " + x1 + " e X2 = " + x2 );
		}
		
		sc.close();
		
		
	}


}

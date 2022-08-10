package exercicios;

public class Exercicio60 {
	
	public static void main(String[] args) {
		double f = 0.00, c = 0.00;
		
		System.out.println("A conversão de 10 em 10 graus, de celsius para fahrenheit é:");

		for(c = 10; c<=100;c = c+10){
		    f = ((9*c)+160)/5;
		    System.out.println("A conversão de "+c+" graus celsius para Fahrenheit é "+f);
		}

	}

}

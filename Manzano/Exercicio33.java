package exercicios;

public class Exercicio33 {
	
	public static void main(String[] args) {
		int cont = 0;
		int base = 3;
		int pot = 0;
		int i = 0;
		
		
		while(cont <= 15) {
			if(cont == 0) {
				pot = 1;
			}
			
			if(cont == 1) {
				pot = 1;
			}
			
			while(i <= cont) {
				pot *= base;
				i++; 
			}
			
			
			System.out.println(base + " ^ " + cont + " = " + pot);
			cont++;
		}
		

		}

}

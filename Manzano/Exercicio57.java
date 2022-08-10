package exercicios;

public class Exercicio57 {
	
	public static void main(String[] args) {
		int base = 3, potencia = 1;
		
		for(int expoente = 0;expoente <= 15; expoente++){
		    if(expoente != 0){
		        potencia = 1;
		        for(int contadora = 1;contadora <= expoente;contadora++){
		            potencia = potencia * base;
		        }
		        System.out.println(potencia);
		    }
		    if(expoente == 0){
		    	System.out.println(1);
		    }
		}
	}

}

package exercicios;

public class Exercicio59 {
	
	public static void main(String[] args) {
		int nAnterior = 1, principal = 1, seguinte = 0;
		
		System.out.println(nAnterior);
		System.out.println(principal);
		
		for(int contadora = 3; contadora <= 15;contadora++){
		    seguinte = principal+nAnterior;
		    nAnterior = principal;
		    principal = seguinte;
		    System.out.println(seguinte);
		}

	}

}

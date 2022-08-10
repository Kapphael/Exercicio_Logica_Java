package exercicios;

public class Exercicio36 {
	
	public static void main(String[] args) {
		int celsius = 10;
		int farh = 0;
		
		while(celsius <= 100) {
			farh = (9 * celsius + 160) / 5;
			System.out.println(celsius + "C° = " + farh + "F°");
			
			
			celsius += 10;
		}

	}

}

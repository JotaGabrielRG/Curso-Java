package ExercicioRepeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, disel = 0, combustivel;

		combustivel = sc.nextInt();

		while (combustivel != 4) {

			if (combustivel == 1) {
				alcool ++;

			}
			if (combustivel == 2) {
				gasolina++;

			}
			if (combustivel == 3) {
				disel++;

			}
			
			combustivel = sc.nextInt();

		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Disel: " + disel);
		
		
		sc.close();

	}

}

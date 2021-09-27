import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int codigo, quantidade;
		double cachorroQuente = 4.00, xSalada=4.50, xBacon = 5.00, torradaSimples = 2.00, refrigerante = 1.50;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if(codigo == 1) {
			System.out.printf("Total: R$ %.2f%n", cachorroQuente * quantidade);
		}
		if(codigo == 2) {
			System.out.printf("Total: R$ %.2f%n", xSalada * quantidade);
		}
		if(codigo == 3) {
			System.out.printf("Total: R$ %.2f%n", xBacon * quantidade);
		}
		if(codigo == 4) {
			System.out.printf("Total: R$ %.2f%n", torradaSimples * quantidade);
		}
		if(codigo == 5) {
			System.out.printf("Total: R$ %.2f%n", refrigerante * quantidade);
		}
		sc.close();
		
		

	}

}

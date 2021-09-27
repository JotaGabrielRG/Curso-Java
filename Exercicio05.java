import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		
		int PECA1, COD1, PECA2, COD2;
		double VALOR1, VALOR2, VALORPAGO;
		
		COD1= sc.nextInt();
		PECA1 = sc.nextInt();
		VALOR1 = sc.nextDouble();
		
		COD2= sc.nextInt();
		PECA2 = sc.nextInt();
		VALOR2 = sc.nextDouble();
		
		VALORPAGO = PECA1 * VALOR1 + PECA2 * VALOR2;
		
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n ", VALORPAGO);
		
		
		
		sc.close();
	}

}

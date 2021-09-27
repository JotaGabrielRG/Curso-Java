import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double salario, imposto;

		salario = sc.nextDouble();

		imposto = (1000 * 8) / 100;

		if (salario <= 2000.00) {
			System.out.println("Isento");
		}

		if (salario > 2000.00 && salario <= 3000.00) {
			salario -= 2000.0;
			imposto += ((salario * 8) / 100);
			System.out.printf("R$ %.2f%n", imposto);
		}
		if (salario > 3000.00 && salario <= 4500.00) {
			salario -= 3000;
			imposto += ((salario * 18) / 100);
			System.out.printf("R$ %.2f%n", imposto);
		} else if (salario > 4500.00) {
			salario -= 4500;
			imposto += ((salario * 28) / 100) + 1500.0 * 18 / 100;
			System.out.printf("R$ %.2f%n", imposto);
		}

		sc.close();
	}

}

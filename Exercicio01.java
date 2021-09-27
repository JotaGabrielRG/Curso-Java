import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		int soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.printf("SOMA = "+ soma);
		
		sc.close();

	}

}

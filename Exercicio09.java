import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner (System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A % 2 == 0 || B % 2 == 0) {
			
			System.out.println("Sao Multiplos");
		}
		else
			
			System.out.println("Nao sao Multiplos");
		
		sc.close();

	}

}

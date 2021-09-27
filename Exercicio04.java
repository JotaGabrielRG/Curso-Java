import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N, NH;
		double VH, H;
		
		N = sc.nextInt();
		NH = sc.nextInt();
		VH = sc.nextDouble();
		
				
		H = VH * NH;
		
		System.out.println("NUMBER = " + N);
		System.out.printf("SALARY = U$ %.2f%n  ", H);
		
		
	sc.close();	
	}

}

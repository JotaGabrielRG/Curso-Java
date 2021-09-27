import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double r;
		double pi = 3.14159;
		double area;
		
		r = sc.nextDouble();
		
		area = pi * Math.pow(r, 2);
		
		System.out.printf("A= %.4f%n", area);
		
		sc.close();

	}

}

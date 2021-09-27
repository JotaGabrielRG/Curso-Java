import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, PI = 3.14159, AREATRIANGULO, AREARAIO, AREATRAPEZIO, AREAQUADRADO, AREARETANGULO;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		AREATRIANGULO = (A*C)/2;
		AREARAIO = PI * Math.pow(C, 2);
		AREATRAPEZIO = (A+B)*C/2;
		AREAQUADRADO = B*B;
		AREARETANGULO = A*B;
		
		System.out.printf("TRIANGULO: %.3f%n", AREATRIANGULO);
		System.out.printf("CRICULO: %.3f%n", AREARAIO);
		System.out.printf("TRAPEZIO: %.3f%n", AREATRAPEZIO);
		System.out.printf("QUADRADO: %.3f%n", AREAQUADRADO);
		System.out.printf("RENTANGULO: %.3f%n", AREARETANGULO);
			
		
		
		
		sc.close();

	}

}

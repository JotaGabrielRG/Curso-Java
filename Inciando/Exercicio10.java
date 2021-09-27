import java.util.Scanner;

public class Exercicio10 {
	
	/*
	 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
	 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
	 * uma duração mínima de 1 hora e máxima de 24 horas. Exemplos: Entrada: Saída:
	 * 16 2 O JOGO DUROU 10 HORA(S) Entrada: Saída: 0 0 O JOGO DUROU 24 HORA(S)
	 * Entrada: Saída: 2 16 O JOGO DUROU 14 HORA(S)
	 */

	public static void main(String[] args) {
			
		Scanner sc= new Scanner(System.in);
		

		int HI, HF, DURACAO;
		
		HI = sc.nextInt();
		HF = sc.nextInt();
		
		DURACAO = (HI - HF);
		
		System.out.println("O JOGO DUROU " + DURACAO +" HORA(S)");
		
		sc.close();
	}

}

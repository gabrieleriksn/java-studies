package exercicios;
import java.util.Scanner;

public class exercicio_05_secao_06_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtd = sc.nextInt();
		
		int i = 0, contadorDentro = 0, contadorFora = 0;
		while (i < qtd) {
			int num = sc.nextInt();
			
			if (10 <= num && num <= 20) {
				contadorDentro += 1;
			}
			
			else {
				contadorFora += 1;
			}
			
			i += 1;
		}
		
		System.out.println(contadorDentro + " in");
		System.out.println(contadorFora + " out");
		
		sc.close();
	}

}

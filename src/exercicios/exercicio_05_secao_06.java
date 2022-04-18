package exercicios;
import java.util.Scanner;

public class exercicio_05_secao_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtd = sc.nextInt();
		
		int contadorDentro = 0, contadorFora = 0;
		for (int i = 0; i < qtd; i += 1) {
			
			int num = sc.nextInt();
			
			if (10 <= num && num <= 20) {
				contadorDentro += 1; 
			}
			
			else {
				contadorFora += 1;
			}
		}
		
		System.out.println(contadorDentro + " in");
		System.out.println(contadorFora + " out");
		
		sc.close();
	}

}

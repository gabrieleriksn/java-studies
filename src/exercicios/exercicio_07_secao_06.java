package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_07_secao_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtd = sc.nextInt();
		
		for (int i = 0; i < qtd; i += 1) {
			int a, b;
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			if (b != 0) {
				double divisao = (double) a / b;
				System.out.println(divisao);
			}
			
			else {
				System.out.println("divisao impossivel");
			}
		}
		
		sc.close();
	}

}

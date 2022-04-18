package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_06_secao_06_while {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtd = sc.nextInt();
		
		int i = 0;
		while (i < qtd) {
			double a = 0, b = 0, c = 0, media = 0;
			
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			media = (a * 2 + b * 3 + c * 5) / 10;
			
			System.out.printf("%.1f%n", media);
			
			i += 1;
		}
		
		sc.close();
	}

}

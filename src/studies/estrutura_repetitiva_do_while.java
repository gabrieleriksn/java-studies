package studies;
import java.util.Scanner;
import java.util.Locale;

public class estrutura_repetitiva_do_while {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Estrutura do while:
		int i = 0;
		do {
			System.out.println(i);
			i += 1;
		} while (i < 8);
		// Perceba que temos um inicializador o corpo e a condi��o.
		// Mas a condi��o s� � checada no final, ap�s a cadeia do c�digo j� ter sido
		// EXECUTADA.
		
		// Usando o loop-leave
		while (true) {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			
			double fahr = (9 * celsius / 5) + 32;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahr);
			
			System.out.print("Deseja repetir (s/n)? ");
			String resposta = sc.next();
			
			if (resposta.equals("n")) {
				break;
			}
		}
		
		// Usando do while
		
		String resposta;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			
			double fahr = (9 * celsius / 5) + 32;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahr);
			
			System.out.print("Deseja repetir (s/n)? ");
			resposta = sc.next();
		} while (resposta.equals("s"));
		
		sc.close();	
	}

}

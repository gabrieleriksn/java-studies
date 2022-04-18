package studies;
import java.util.Scanner;
import java.util.Locale;

public class operadores_de_atribuicao_cumulativa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double valor;

		minutos = sc.nextInt();
		
		valor = 50.00;
		
		if (minutos > 100) {
			valor += (minutos - 100.0) * 2.0;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valor);
		
		sc.close();
		
		// OPERADORES DE ATRIBUI��O CUMULATIVA.
		
		// Os operadores de atribui��o cumulativa s�o usados PRINCIPALMENTE EM
		// LA�OS DE REPETI��O.
		
		// a += b ... a = a + b
		// a -= b ... a = a - b
		// a *= b ... a = a * b
		// a /= b ... a = a / b
		// a %= b ... a = a % b
	}

}

package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_05_secao_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		double preco = 0, conta;
		
		codigo = sc.nextInt();
		qtd = sc.nextInt();
		
		if (codigo == 1) {
			preco = 4.00;
		}
		
		else if (codigo == 2) {
			preco = 4.50;
		}
		
		else if (codigo == 3) {
			preco = 5.00;
		}
		
		else if (codigo == 4) {
			preco = 2.00;
		}
		
		else if (codigo == 5) {
			preco = 1.50;
		}
		
		conta = preco * qtd;
		
		System.out.printf("Total: R$ %.2f%n", conta);
		
		sc.close();
	}

}

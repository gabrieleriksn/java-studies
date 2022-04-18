package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class exercicio_05_secao_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoUm, numeroUm, codigoDois, numeroDois;
		double valorUnitarioUm, valorUnitarioDois, totalUm, totalDois, total;
		
		codigoUm = sc.nextInt();
		numeroUm = sc.nextInt();
		valorUnitarioUm = sc.nextDouble();
		
		codigoDois = sc.nextInt();
		numeroDois = sc.nextInt();
		valorUnitarioDois = sc.nextDouble();
		
		totalUm = numeroUm * valorUnitarioUm;
		totalDois = numeroDois * valorUnitarioDois;
		total = totalUm + totalDois;
		
		System.out.println("C�digo 1: " + codigoUm);
		System.out.println("C�digo 2: " + codigoDois);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}

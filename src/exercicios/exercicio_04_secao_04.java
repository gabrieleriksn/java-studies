package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class exercicio_04_secao_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalhadas;
		double valorPorHora, salario;
		
		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorPorHora = sc.nextDouble();
		
		salario = valorPorHora * horasTrabalhadas;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}

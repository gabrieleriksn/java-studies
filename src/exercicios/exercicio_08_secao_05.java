package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_08_secao_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto = 0, f1 = 0, f2 = 0, f3 = 0;
		
		salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			imposto += 0;
		}
		
		else if (salario >= 2000.01 && salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
		}
		
		else if (salario >= 3000.01 && salario <= 4500.00) {
			f1 = (salario - 3000.00) * 0.18;
			f2 = (salario - (salario - 3000.00) - 2000) * 0.08;
			imposto = f1 + f2;
		}
		
		else {
			f1 = (salario - 4500) * 0.28;
			f2 = (salario - (salario - 4500.00) - 3000.00) * 0.18;
			f3 = (salario - (salario - 4500) - (salario - (salario - 4500.00) - 3000.00) - 2000) * 0.08;
			imposto = f1 + f2 + f3;
		}
		
		
		if (imposto == 0) {
			System.out.println("Isento");
		}
		
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

}

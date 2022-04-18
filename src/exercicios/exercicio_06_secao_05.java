package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class exercicio_06_secao_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String res;
		double num;
		
		num = sc.nextDouble();
		
		if (num >= 0 && num <= 25) {
			res = "Intervalo [0, 25]";
		}
		
		else if (num > 25 && num <= 50) {
			res = "Intervalo (25, 50]";
		}
		
		else if (num > 50 && num <= 75) {
			res = "Intervalo (50, 75]";
		}
		
		else if (num > 75 && num <= 100) {
			res = "Intervalo (75, 100]";
		}
		
		else {
			res = "Fora de intervalo";
		}
		
		System.out.println(res);
		
		sc.close();
	}

}

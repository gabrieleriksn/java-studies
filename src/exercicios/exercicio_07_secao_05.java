package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_07_secao_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		String res;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			res = "Q1";
		}
		
		else if (x > 0 && y < 0) {
			res = "Q4";
		}
		
		else if (x < 0 && y > 0) {
			res = "Q2";
		}
		
		else if (x < 0 && y < 0) {
			res = "Q3";
		}
		
		else if (x == 0 && y != 0) {
			res = "Eixo Y";
		}
		
		else if (x != 0 && y == 0) {
			res = "Eixo X";
		}
		
		else {
			res = "Origem";
		}
		
		System.out.println(res);

		sc.close();
	}

}

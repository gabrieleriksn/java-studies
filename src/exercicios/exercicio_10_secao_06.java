package exercicios;
import java.util.Scanner;

public class exercicio_10_secao_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i += 1) {
			int a, b, c;
			
			a = i;
			b = i * i;
			c = i * i * i;
			
			System.out.printf("%d %d %d%n", a, b, c);
		}
		
		sc.close();
	}

}

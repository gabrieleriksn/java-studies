package exercicios;
import java.util.Scanner;

public class exercicio_09_secao_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i += 1) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}

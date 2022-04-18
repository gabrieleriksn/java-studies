package exercicios;
import java.util.Scanner;

public class exercicio_08_secao_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int fatorial = 1;
		for (int i = 1; i <= num; i += 1) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		
		sc.close();
	}

}

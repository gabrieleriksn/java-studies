package exercicios;
import java.util.Scanner;

public class exercicio_03_secao_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		String res;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		// Podem ser digitados em ordem crescente ou at� decrescente.
		
		res = (a % b == 0 || b % a == 0) ? "S�o M�ltiplos" : "N�o s�o M�ltiplos";
		
		System.out.println(res);
		
		sc.close();
	}

}

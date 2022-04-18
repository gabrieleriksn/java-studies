package studies;
import java.util.Scanner;

public class estrutura_repetitiva_while {

	public static void main(String[] args) {
		// while � uma estrutura de repeti��o que vai ficar rodando "enquanto" uma condi��o
		// for VERDADEIRA.
		// Utilizamos o while quando n�o sabemos previamente a 
		// quantidade de repeti��es que ser�o realizadas
		
		Scanner sc = new Scanner(System.in);
		
		int a, soma = 0;
		
		// while conditional. while (condi��o) {<corpo>}
		
		a = sc.nextInt();
		while (a != 0) {
			soma += a;
			a = sc.nextInt();
		}
		
		// while true. (loop-leave)
		
		while (true) {
			a = sc.nextInt();
			
			if (a == 0) {
				break;
			}
			
			soma += a;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}

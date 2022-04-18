package studies;
import java.util.Scanner;

public class estrutura_repetitiva_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Como usamos for em java?
		// lembrando que for � usado quando j� sabemos a quantidade de repeti��es
		// que precisaremos ter.
		// for � um comando de itera��o que usaremos auxiliados de sequ�ncias
		
		// Estrutura b�sica
		//for (<iniciializador> ; <condi��o> ; <atualizador>) {
		// 	<corpo>
		// 	<corpo>
		//}
		int qtd = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < qtd; i += 1) {
			int num = sc.nextInt();
			soma += num;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}

package exercicios;
import java.util.Scanner;

public class exercicio_04_secao_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		for (int i = 1; i <= valor; i += 2) {
			System.out.println(i);
		}		
		
		int j = 1;
		while (j <= valor) {
			System.out.println(j);
			j += 2;
		}
		
		// Fica mais claro ainda que o for � a MESMA COISA que o WHILE.
		// mas escrito de uma forma mais concisa e de mais f�cil leitura.
		
		sc.close();
	}

}

package exercicios;
import java.util.Scanner;

public class exercicio_01_secao_06_sol2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int senha = sc.nextInt();
			
			if (senha == 2002) {
				break;
			}
			
			System.out.println("Senha Invalida");
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}

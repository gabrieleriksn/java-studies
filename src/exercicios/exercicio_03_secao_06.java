package exercicios;
import java.util.Scanner;

public class exercicio_03_secao_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		int contadorAlcool = 0, contadorGasolina = 0, contadorDiesel = 0;
		while (true) {
			opcao = sc.nextInt();
			
			if (opcao == 4) {
				break;
			}
			
			if (opcao == 1) {
				contadorAlcool += 1;
			}
			
			else if (opcao == 2) {
				contadorGasolina += 1;
			}
			
			else if (opcao == 3) {
				contadorDiesel += 1;
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + contadorAlcool);
		System.out.println("Gasolina: " + contadorGasolina);
		System.out.println("Diesel: " + contadorDiesel);
		
		sc.close();
	}

}

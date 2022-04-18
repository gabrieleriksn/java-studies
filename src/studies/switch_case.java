package studies;
import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Programa que recebe um n�mero e fornce o dia da semana
		
		int x = sc.nextInt();
		String dia;
		
		if (x == 1) {
			dia = "Domingo";
		}
		
		else if (x == 2) {
			dia = "Segunda";
		}
		
		else if (x == 3) {
			dia = "Ter�a";
		}
		
		else if (x == 4) {
			dia = "Quarta";
		}
		
		else if (x == 5) {
			dia = "Quinta";
		}
		
		else if (x == 6) {
			dia = "Sexta";
		}
		
		else if (x == 7) {
			dia = "S�bado";
		}
		
		else {
			dia = "valor inv�lido";
		}
		
		System.out.println(dia);
		
		// ESSA � A ESTRUTURA COM IF. ELSE IF e ELSE.
		// Tem uma alternativa a ela chamada de switch-case (particularmente n�o gostei).
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Ter�a";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "S�bado";
			break;
		default:
			dia = "valor inv�lido";
			break;
		}
		
		System.out.println(dia);
		
		sc.close();
	}

}

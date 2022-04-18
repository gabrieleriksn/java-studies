package studies;
import java.util.Scanner;

public class exemplificando_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String entrada;
		
		int num, soma = 0;
		
		while (true) {
			entrada = sc.nextLine();
			
			if (entrada.equals("fim")) {
				break;
			}
			
			num = Integer.parseInt(entrada);
			
			soma += num;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}

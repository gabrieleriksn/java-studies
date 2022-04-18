package exercicios;
import java.util.Scanner;

public class exercicio_02_secao_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		String quadrante = "";
		
		while (true) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x == 0 || y == 0) {
				break;
			}
			
			if (x > 0 && y > 0) {
				quadrante = "primeiro";
			}
			
			else if (x > 0 && y < 0) {
				quadrante = "quarto";
			}
			
			else if (x < 0 && y > 0) {
				quadrante = "segundo";
			}
			
			else if (x < 0 && y < 0) {
				quadrante = "terceiro";
			}
			
			
			System.out.println(quadrante);
		}
	
		sc.close();
	}

}

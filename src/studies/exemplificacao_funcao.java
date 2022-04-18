package studies;
import java.util.Scanner;

public class exemplificacao_funcao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Forne�a 3 n�meros: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.print("O valor m�ximo � : ");
		System.out.println(maximo(a, b, c));
		
		sc.close();
	}
	
	public static int maximo(int x, int y, int z) {
		if (x > y && x > z) {
			return x;
		}
		
		else if (y > z) {
			return y;
		}
		
		else {
			return z;
		}
	} 

}

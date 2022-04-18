package exercicios;
import java.util.Scanner;

public class exercicio_01_secao_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String res;
		
		int x = sc.nextInt();
		
		res = (x >= 0) ? "N�O NEGATIVO" : "NEGATIVO";
		
		System.out.println(res);
		
		sc.close();
	}

}

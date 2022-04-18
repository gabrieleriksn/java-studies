package exercicios;
import java.util.Scanner;

public class exercicio_02_secao_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String res;
		
		int num = sc.nextInt();
		
		res = (num % 2 == 0) ? "PAR" : "�MPAR";
		
		System.out.println(res);
		
		sc.close();
	}

}

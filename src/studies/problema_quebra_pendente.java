package studies;
import java.util.Scanner;
import java.util.Locale;

public class problema_quebra_pendente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		// Esse problema acontece qunaod temos um sc.next() ou sc.nextInt() ou sc.nextFouble() ou
		// sc.next.charAt(0) e ap�s ele(s) um sc.nextLine().
		// Como apertamos o enter para finalizar a entrada o \n acaba sendo consumido pelo sc.nextLine()
		// e uma linha vazia ser� armazenada nele. Como resolver? adicionando um sc.nextLine() extra
		// antes daquele que � do seu interesse de fato.
		int x;
		String s1, s2, s3;
		System.out.println("Forne�a um inteiro e tr�s strings:");
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("Dados fornecidos:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}

}

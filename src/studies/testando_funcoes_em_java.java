package studies;
import java.util.Scanner;

public class testando_funcoes_em_java {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Implementando o meu in...
		
		String str = sc.nextLine();
		char c = sc.next().charAt(0);
		
		System.out.println(meuIn(str, c));
		
		sc.close();
	}
	
	public static boolean meuIn(String strQualquer, char charQualquer) {
		
		for (int i = 0; i < strQualquer.length(); i++) {
			if (strQualquer.charAt(i) == charQualquer) {
				return true;
			}
		}
		
		return false;
	}

}

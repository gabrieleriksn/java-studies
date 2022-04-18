package studies;
import java.util.Scanner;

public class funcoes_interessante_strings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// str.toLowerCase() - Deixa com letras min�sculas (OK) // SEM EFEITO COLATERAL
		// Character.toLowerCase(caracter)
		// str.toUpperCase() - Deixa com letras mai�sculas (OK) // SEM EFEITO COLATERAL
		// Character.toUpperCase(caracter)
		// trim() - Remove espa�os dos cantos. Basicamente � o .strip() (OK) // SEM EFEITO COLATERAL
		// substring(inicio, fim) - � o slice, basicamente...  (OK) // SEM EFEITO COLATERAL
		// replace(char, char) ou replace(string, string) - Replace... (OK) // SEM EFEITO COLATERAL
		// indexOf, lastIndexOf (busca linear)... (OK) // SEM EFEITO COLATERAL
		// str.split("separador") - split... (OK) // Funciona de modo semelhante... 
		// String.length() - diz o tamanho da string... � o len() (OK) // SEM EFEITO COLATERAL
		// Como fazer acesso indexado? String.charAt(posic�o) (OK)
		//  str.equals(str) -> no lugar de comprar string com "==" o ideal � usar o equals...
		
		String s = sc.nextLine();
		char dado = sc.next().charAt(0);
		
		// Implementando acesso indexado:
		for (int i = 0; i < s.length(); i += 1) {
			System.out.println(s.charAt(i));
		}
		
		// Implementando um in...
		
		boolean in_lista = false;
		for (int i = 0; i < s.length(); i += 1) {
			if (dado == s.charAt(i)) {
				in_lista = true;
				break;
			}
		}
		
		// Implementando o slice...
		
		int index = sc.nextInt();
		String concatena = "";
		for (int i = 0; i <= index; i += 1) {
			concatena += s.charAt(i);
		}
		
		
		// Implementando o Replace
		//vamos trocar a letra "a" por "4"...
		String newConcatena = "";
		int indexQuatro = 0;
		for (int i = 0; i < concatena.length(); i++) {
			if (concatena.charAt(i) == 'a') {
				newConcatena += '4';
				indexQuatro = i;
			}
			else {
				newConcatena += concatena.charAt(i);
			}
		}
		
		String[] vetor = s.split(" ");
		
		System.out.println(concatena);
		System.out.println(newConcatena.trim());
		System.out.println(indexQuatro);
		System.out.println(vetor);
		System.out.println(in_lista);
		
		sc.close();
	}

}

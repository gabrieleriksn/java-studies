package exercicios;

import java.util.Scanner;

public class senha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palavra = sc.nextLine();
		char primeiraLetra = palavra.charAt(0);
		
		String concatena = "";
		int contador = 0;
		concatena += primeiraLetra;
		for (int i = 1; i < palavra.length(); i++) {
			if (palavra.charAt(i) == 'A' || palavra.charAt(i) == 'a') {
				concatena += '4';
				contador += 1;
			}
			
			else if (palavra.charAt(i) == 'E' || palavra.charAt(i) == 'e') {
				concatena += '3';
				contador += 1;
			}
			
			else if (palavra.charAt(i) == 'I' || palavra.charAt(i) == 'i') {
				concatena += '1';
				contador += 1;
			}
			
			else if (palavra.charAt(i) == 'O' || palavra.charAt(i) == 'o') {
				concatena += '0';
				contador += 1;
			}
			
			else {
				concatena += palavra.charAt(i);
			}
		}
		
		System.out.printf("%s (%d) troca(s)", concatena, contador);
		
		sc.close();
	}

}

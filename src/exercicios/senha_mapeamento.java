package exercicios;

import java.util.Scanner;

public class senha_mapeamento {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palavra = sc.nextLine();
			
		String mapaOrigem = "AEIO";
		String mapaDestino = "4310";
		
		String concatena = "";							
		concatena += palavra.charAt(0);
		for (int i = 1; i < palavra.length(); i++) {
			if (index(mapaOrigem, Character.toUpperCase(palavra.charAt(i))) != -1) {
				concatena += mapaDestino.charAt(index(mapaOrigem, Character.toUpperCase(palavra.charAt(i))));
			}
			
			else {
				concatena += palavra.charAt(i);
			}
		}
		
		System.out.println(concatena);
		
		sc.close();
	}
	
	public static int index(String mapa, char letra) {
		
		int index = -1;
		
		for (int i = 0; i < mapa.length(); i += 1) {
			if (mapa.charAt(i) == letra) {
				return i;
			}
		}
		return index;
	}

}

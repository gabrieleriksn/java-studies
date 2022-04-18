package exercicios;

import java.util.Scanner;

public class vizinho_igual {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] seq = sc.nextLine().split(" ");
				
		int contador = 0;
		for (int i = 0; i < seq.length - 1; i++) {
			if (seq[i].equals(seq[i + 1])) {
				contador += 1;
			}
		}
		
		System.out.println(contador);
		
		sc.close();
	}
	
}

package exercicios;

import java.util.Scanner;

public class camisas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// while conditional
		
		/*
		String cor = sc.nextLine();

		int contador = 0;
		while (cor.equals("preta") == false) {
			
			if (cor.equals("vermelha")) {
				contador += 1;
			}
			
			cor = sc.nextLine();
		}
		
		System.out.println(contador + " camisas vermelhas");
		*/
		
		// while true;
		
		/*
		int contador = 0;
		while (true) {
			String cor = sc.nextLine();
			
			if (cor.equals("preta")) {
				break;
			}
			
			if (cor.equals("vermelha")) {
				contador += 1;
			}
		}
		
		System.out.println(contador + " camisas vermelhas");
		*/
		
		// do while:
		
		int contador = 0;
		String cor;
		do {
			cor = sc.nextLine();
			
			if (cor.equals("vermelha")) {
				contador += 1;
			}
		} while (cor.equals("preta") == false);
		
		System.out.println(contador + " camisas vermelhas");
		
		sc.close();
	}

}

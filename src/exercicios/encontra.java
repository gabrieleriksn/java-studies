package exercicios;

import java.util.Scanner;

public class encontra {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Como converter de inteiro para string??
		 * 
		 * Integer.toString(numero);       
		 * 
		 * Como converter de string para inteiro?
		 * 
		 * Integer.parseInt(string);
		 */
		
		int num = sc.nextInt();
		sc.nextLine();
		String[] vetor = sc.nextLine().split(" ");
		
		boolean presente = false;
		for (int i = 0; i < vetor.length; i++) {
			if (Integer.parseInt(vetor[i]) == num) {
				presente = true;
				break;
			}
		}
		
		
		
		System.out.println(presente);
		
		sc.close();
	}

}

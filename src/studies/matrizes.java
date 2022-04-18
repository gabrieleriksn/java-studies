package studies;

import java.util.Scanner;

public class matrizes {

	public static void main(String[] args) {
		/*
		 * MATRIZES 
		 * 
		 * S�o Array de dados bidimensionais nas quais temos que ter quantidade
		 * de linhas e quantidade de colunas.
		 * 
		 * Vai ter acesso a todas as vantagens e desvantagens dos Arrays.
		 * 
		 * A intancia��o funciona da mesma forma da instancia��o de vetores s� muda que � bidimensional.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		String concatena = "";
		int contadorDeNegativos = 0;
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (i == j) {
					concatena += matriz[i][j] + " ";
				}
				if (matriz[i][j] < 0) {
					contadorDeNegativos += 1;
				}
			}
		}
		
		concatena = concatena.trim();
		
		System.out.println("Main diagonal:");
		System.out.println(concatena);
		System.out.println("Negative numbers = " + contadorDeNegativos);
		
		sc.close();
	}

}

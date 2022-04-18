package exercicios;
import java.util.Scanner;

public class exercicio_proposto_secao_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int lines = sc.nextInt();
		int columns = sc.nextInt();
		
		int[][] m = new int[lines][columns];
		
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		
		int num = sc.nextInt();
		
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				if (m[i][j] == num) {
					
					System.out.printf("Position %d,%d:%n", i, j);
					
					if (i == 0) {
						if(j == 0) {
							System.out.printf("Right: %d%n", m[i][j+1]);
							System.out.printf("Down: %d%n", m[i+1][j]);
						}
						
						else if(j == m[i].length - 1) {
							System.out.printf("Left: %d%n", m[i][j-1]);
							System.out.printf("Down: %d%n", m[i+1][j]);
						}
						
						else {
							System.out.printf("Left: %d%n", m[i][j-1]);
							System.out.printf("Right: %d%n", m[i][j+1]);
							System.out.printf("Down: %d%n", m[i+1][j]);
						}
					}
					
					
					else if (i == m.length - 1) {
						if (j == 0) {
							System.out.printf("Right: %d%n", m[i][j+1]);
							System.out.printf("Up: %d%n", m[i-1][j]);	
						}
						
						else if (j == m[i].length - 1) {
							System.out.printf("Left: %d%n", m[i][j-1]);
							System.out.printf("Up: %d%n", m[i-1][j]);
						}
						
						else {
							System.out.printf("Left: %d%n", m[i][j-1]);
							System.out.printf("Right: %d%n", m[i][j+1]);
							System.out.printf("Up: %d%n", m[i-1][j]);
						}
					}
					
					
					else if (j == 0) {
						if (i == 0) {
							System.out.printf("Right: %d%n", m[i][j+1]);
							System.out.printf("Down: %d%n", m[i+1][j]);
						}
						
						else if (i == m.length - 1) {
							System.out.printf("Left: %d%n", m[i][j-1]);
							System.out.printf("Up: %d%n", m[i-1][j]);
						}
						
						else {
							System.out.printf("Right: %d%n", m[i][j+1]);
							System.out.printf("Up: %d%n", m[i-1][j]);
							System.out.printf("Down: %d%n", m[i+1][j]);
						}
					}
					
					
					else if (j == m[i].length - 1) {
						if (i == 0) {
							System.out.printf("Left: %d%n", m[i][j-1]);
							System.out.printf("Down: %d%n", m[i+1][j]);
						}
						
						else if (i == m.length - 1) {
							System.out.printf("Left: %d%n", m[i][j-1]);
							System.out.printf("Up: %d%n", m[i-1][j]);
						}
						
						else {
							System.out.printf("Left: %d%n", m[i][j-1]);
							System.out.printf("Up: %d%n", m[i-1][j]);
							System.out.printf("Down: %d%n", m[i+1][j]);
						}
					}
					
					
					else {
						System.out.printf("Position %d,%d:%n", i, j);
						System.out.printf("Left: %d%n", m[i][j-1]);
						System.out.printf("Right: %d%n", m[i][j+1]);
						System.out.printf("Up: %d%n", m[i-1][j]);
						System.out.printf("Down: %d%n", m[i+1][j]);
					}
				}
			}
		}
		
		/*
		System.out.printf("Position %d,%d:%n", i, j);
		System.out.printf("Left: %d%n", m[i][j-1]);
		System.out.printf("Right: %d%n", m[i][j+1]);
		System.out.printf("Up: %d%n", m[i-1][j]);
		System.out.printf("Down: %d%n", m[i+1][j]);
		*/
		
		sc.close();
	}

}

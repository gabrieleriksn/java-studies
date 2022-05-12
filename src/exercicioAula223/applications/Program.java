package exercicioAula223.applications;

import java.util.Scanner;
import exercicioAula223.services.PrintService;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<Integer>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			ps.addValue(num);
		}
		ps.print();
		System.out.println("First: "+ ps.first());
		
		sc.close();
	}
}

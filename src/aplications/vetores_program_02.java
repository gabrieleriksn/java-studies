package aplications;

import java.util.Locale;
import java.util.Scanner;
import entities.ProductVector;

public class vetores_program_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantityExecutions = sc.nextInt();
		
		ProductVector[] vect = new ProductVector[quantityExecutions];
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVector(name, price);
		}
		
		double sum = 0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double average = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", average);
		
		sc.close();
	}

}

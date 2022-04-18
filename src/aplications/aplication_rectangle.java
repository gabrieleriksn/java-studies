package aplications;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class aplication_rectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle ret = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		
		double area = ret.area();
		double perimeter = ret.perimeter();
		double diagonal = ret.diagonal();
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PERIMETER = %.2f%n", perimeter);
		System.out.printf("DIAGONAL = %.2f%n", diagonal);
		
		sc.close();
	}

}

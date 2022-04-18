package studies;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class problema_sem_poo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Tri�ngulo X
		
		System.out.println("Enter the measures of triangle X:");
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		double areaX = x.area();
		
		System.out.println("Enter the measures of triangle Y:");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaY = y.area();
		
		// Maior
		
		char trianguloMaior;
		trianguloMaior = (areaX > areaY) ? 'X' : 'Y';
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		System.out.println("Larger area: " + trianguloMaior);
		
		sc.close();
	}
	
}

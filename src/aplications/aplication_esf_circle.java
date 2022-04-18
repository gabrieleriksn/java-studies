package aplications;

import java.util.Locale;
import java.util.Scanner;
// import entities.Circle;
// import entities.Sphere;
import entities.Calculator;


public class aplication_esf_circle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Um método possível de resolver seria esse daqui:
		
		/*
		Circle c = new Circle();
		Sphere e = new Sphere();
		
		System.out.print("Enter radius: ");
		e.radius = c.radius = sc.nextDouble();
		
		double circumference = c.circumference();
		double volume = e.volume();
		
		System.out.printf("Circumference: %.2f%n", circumference);
		
		System.out.printf("Volume: %.2f%n", volume);
		
		System.out.printf("PI value: %.2f%n", Circle.PI);
		*/
		
		// Outro jeito seria com uma classe calculator com membros
		// estáticos, assim, não precisaríamos instanciar dentro do programa.
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", Calculator.PI);
		
		sc.close();
	}

}

package exercicioAula151.aplication;

import java.util.Scanner;
import java.util.Locale;
import exercicioAula151.entities.Shape;
import exercicioAula151.entities.Rectangle;
import exercicioAula151.entities.Circle;
import exercicioAula151.entities_enums.Color;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        Shape[] shapesVect = new Shape[n];
        for (int i=0; i<n; i++) {
            System.out.printf("Shape #%d data:%n", i+1);
            
            System.out.print("Rectangle or Circle (r/c)? ");
            Character res = sc.next().charAt(0);
            
            System.out.print("COLOR (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (res.equals('r')) {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                
                System.out.print("Heigth: ");
                double heigth = sc.nextDouble();
                
                shapesVect[i] = new Rectangle(color, width, heigth); 
            }

            else if (res.equals('c')) {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                
                shapesVect[i] = new Circle(color, radius);
            }
        }

        System.out.println();

        System.out.println("SHAPE AREAS:");
        for (Shape shape : shapesVect) {
            System.out.printf("%.2f%n", shape.area());
        }
        
        sc.close();
    }
}

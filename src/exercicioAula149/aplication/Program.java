package exercicioAula149.aplication;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import exercicioAula149.entities.Product;
import exercicioAula149.entities.ImportedProduct;
import exercicioAula149.entities.UsedProduct;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> productsList = new ArrayList<>();
        for (int i=0; i<n; i++) {
            System.out.printf("Product #%d data:%n", i + 1);
            
            System.out.print("Common, used, or imported (c/u/i)? ");
            Character res = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (res.equals('c')) {
                Product product = new Product(name, price);
                productsList.add(product);
            }

            else if (res.equals('u')) {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next()); 
                Product product = new UsedProduct(name, price, manufactureDate);
                productsList.add(product);
            }

            else if (res.equals('i')) {
                System.out.print("Customns fee: ");
                double customnsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customnsFee);
                productsList.add(product);
            }
        }

        System.out.println();
        
        System.out.println("PRICE TAGS:");       
        for (Product product : productsList) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}

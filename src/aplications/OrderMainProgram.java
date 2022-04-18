package aplications;

import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import entities.ClientRf;
import entities.OrderItemRf;
import entities.OrderRf;
import entities.ProductRf;
import entities_enums.OrderStatusRf;

public class OrderMainProgram {
    public static void main(String[] args)  throws ParseException{
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 

        System.out.println("Enter client data:");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());        
        ClientRf client = new ClientRf(name, email, birthDate);

        System.out.println("Enter order data:");
        
        System.out.print("Status: ");
        OrderStatusRf status = OrderStatusRf.valueOf(sc.next());

        OrderRf order = new OrderRf(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.printf("Enter #%d item data:%n", i+1);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();            

            ProductRf product = new ProductRf(productName, productPrice);
            OrderItemRf item = new OrderItemRf(productQuantity, product);
            order.addItem(item);
        }

        sc.nextLine();
        System.out.println();
        
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);
        
        sc.close();
    }
}

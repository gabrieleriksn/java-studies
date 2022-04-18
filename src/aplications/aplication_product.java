package aplications;

import java.util.Locale;
import java.util.Scanner;
import entities.ProductRefactored;

public class aplication_product {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		ProductRefactored product = new ProductRefactored(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
	
		System.out.print("Enter the number of products to be added in stock: ");
		int qtdAdd = sc.nextInt();
		
		product.addProduct(qtdAdd);
		
		System.out.println();
		System.out.println("Update data: " + product.toString());
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int qtdRm = sc.nextInt();
		
		product.rmProduct(qtdRm);
		
		System.out.println();
		System.out.println("Update data: " + product.toString());
		
		sc.close();
	}

}

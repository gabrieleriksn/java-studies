package studies;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class products_poo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product produto;
		produto = new Product();
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		produto.nome = sc.nextLine();
		System.out.print("Price: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		produto.quantidadeNoEstoque = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + produto.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int qtdAdd = sc.nextInt();
		produto.adicionarProdutos(qtdAdd);
		
		System.out.println();
		System.out.println("Update data: " + produto.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		int qtdRm = sc.nextInt();
		produto.removerProdutos(qtdRm);
		
		System.out.println();
		System.out.println("Update data: " + produto.toString());

		sc.close();
	}

}

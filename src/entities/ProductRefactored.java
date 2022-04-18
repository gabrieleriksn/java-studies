package entities;

public class ProductRefactored {
	
	public String name;
	public double price;
	public int quantity;
	
	
	public ProductRefactored(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValue() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
	public void rmProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
			   + ", $ " 
	           + String.format("%.2f", price) 
	           + ", " 
	           + quantity 
	           + " units, Total: $ "
	           + String.format("%.2f%n", totalValue());
	}
}

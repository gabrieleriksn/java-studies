package entities;

public class Product {
	
	public String nome;
	public double preco;
	public int quantidadeNoEstoque;
	
	
	// IMPORTANTE: PODEMOS REFERENCIAR O ATRIBUTO DA CLASSE COM o termo "this", caso haja
	// a possibilidade de ambiguidade
	
	public double valorTotalNoEstoque() {
		return quantidadeNoEstoque * preco;
	}
	
	
	public void adicionarProdutos(int quantidade) {
		quantidadeNoEstoque += quantidade;
	}
	
	
	public void removerProdutos(int quantidade) {
		quantidadeNoEstoque -= quantidade;
	}
	
	
	public String toString() {
		return nome 
				+ ", $ " 
				+ String.format("%.2f", preco) 
				+ ", " 
				+ quantidadeNoEstoque 
				+ " units, Total: $ " 
				+ String.format("%.2f", valorTotalNoEstoque());
	}


}

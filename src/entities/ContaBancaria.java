package entities;

public class ContaBancaria {
	
	private String nomeDoTitular;
	private String numeroDaConta;
	private double saldo;
	
	
	public ContaBancaria(String nomeDoTitular, String numeroDaConta, double depositoInicial) {
		this.nomeDoTitular = nomeDoTitular;
		this.numeroDaConta = numeroDaConta;
		deposito(depositoInicial);
	}
	
	
	public ContaBancaria(String nomeDoTitular, String numeroDaConta) {
		this.nomeDoTitular = nomeDoTitular;
		this.numeroDaConta = numeroDaConta;
	}
	
	
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}
	
	
	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}
	
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	
	
	public String toString() {
		return "Account " 
	           + getNumeroDaConta() 
	           + ", Holder: " 
	           + getNomeDoTitular() 
	           + ", Balance: $ " 
	           + String.format("%.2f", getSaldo());
	}
}

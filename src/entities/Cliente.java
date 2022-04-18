package entities;

public class Cliente {
	
	public String nome;
	public String sexo;
	public String email;
	public int idade;
	
	public Cliente(String nome, int idade, String sexo, String email) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.email = email;
	}
	
	public Cliente(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		email = "Não tem email";
	}
	
	 public void dados() {
		 System.out.println("Nome: " + nome);
		 System.out.println("Idade: " + idade);
		 System.out.println("Sexo: " + sexo);
		 System.out.println("E-mail: " + email);
	 }
}

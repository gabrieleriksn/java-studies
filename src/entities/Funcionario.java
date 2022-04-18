package entities;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public String toString() {
		return getId() + ", " + getNome() + ", " + String.format("%.2f", getSalario());
	}
	
	public void aumentarSalario(double percentage) {
		salario *= (1 + percentage / 100);
	}
}

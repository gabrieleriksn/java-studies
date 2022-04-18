package entities;

public class Individuo {
    
    private String nome;
    private Integer idade;
    private Double altura;

    public Individuo(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String toString() {
        return "Dados do indivíduo: " 
               + "Nome: " + nome + ", "
               + "Idade: " + idade + ", "
               + "Altura: " + String.format("%.2f", altura);
    }
}

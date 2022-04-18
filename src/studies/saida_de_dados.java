package studies;
import java.util.Locale;

public class saida_de_dados {

	public static void main(String[] args) {
		// Sa�da de dados � feita com o print.
		// Pode ter quebra de linha: System.out.println("Alguma coisa");
		// Pode ser sem quebra de linha: System.out.print("Alguma coisa%n");
		
		// Primeiro, vamos fazer declara��es...
		// Para representar inteiros: byte, short, int e long;
		// Para representar ponto flutuante: float e double;
		// Para representar frases e caracteres: char e String;
		// Para representar boleanos: boolean
		
		// Lembrando que a declara��o de uma vari�vel � feita assim:
		// <tipo> <nome> = <valor_inicial(opcional)>;
		
		// Testes:
		
		// Para inteiros:
		// byte numeroByte = 2;
		// short numeroShort = 23;
		int x = 89;
		// long numeroLong = 12121;
		
		// Para Ponto Flutuante:
		double minhaAltura = 1.8512234;
		
		// Para strings:
		// char caractere = 'G';
		
		// Iniciando os processos de sa�da de dados:
		
		// System.out.println("O n�mero byte �: " + numeroByte);
		// System.out.println("O n�mero short �: " + numeroShort);
		// System.out.println("O n�mero inteiro �: " + numeroInt);
		// System.out.println("O n�mero long �: " + numeroLong);
		// System.out.println("Minha altura �: " + minhaAlturaDouble);
		// System.out.println("Exemplo de Caractere: " + caractere);
		
		// Sa�da de dados para inteiros:
		System.out.println(x);
		
		// Sa�da de dados para floats:
		System.out.println(minhaAltura);
		
		// Formatando dados em ponto flutuante:
		
		// Em python:
		// print(f'{minhaAltura:.2f}')
		
		// Em Java:
		// System.out.printf("%.2f%n", <vari�vel flutuante>);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", minhaAltura);
		System.out.printf("%.3f%n", minhaAltura);
		
		// Concatena��o em Java
		System.out.printf("Minha altura �: " + "%.2f" + " metros%n", minhaAltura);
		double precoPorQuiloDePeixe = 21.2345;
		double quilosComprados = 2.2189;
		double totalGasto = precoPorQuiloDePeixe * quilosComprados;
		
		// Forma 1
		// System.out.printf("O quilo de peixe custa R$ " + "%.2f. " + "Jo�o comprou " + "%.2f" + " Kg. "
		// + "Logo, ele gastou R$ " + "%.2f" + " ao todo." + "\n", precoPorQuiloDePeixe, quilosComprados, totalGasto);
		
		// Forma 2 (A mesa coisa que Python, praticamente).
		System.out.printf("O quilo do peixe custa R$ %.2f. Jo�o comprou %.2f Kg. Logo, ele gastou R$ %.2f ao todo.\n", 
				precoPorQuiloDePeixe, quilosComprados, totalGasto);
		
		// Utilizando o printf para os tipos de dados:
		// Para strings: %s
		// Para inteiros: %d
		// Para flutuante: %f
		String nome = "Maria";
		int idade = 38;
		double renda = 3875.589;
		System.out.printf("%s tem %d anos e a renda dela � de R$ %.1f%n", nome, idade, renda);
	}

}

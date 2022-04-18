package studies;
import java.util.Locale;

public class revisando_comandos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Hello World");
		System.out.println("Revisando o estudo inicial de Java.");
		System.out.println();
		// Declara��o de vari�veis inteiras: byte, short, int, long.
		// Declara��o de vari�veis do tipo float: float, double.
		// Declara��o de vari�veis do tipo string: char, String.
		// Declara��o de vari�veis do tipo boolean: true, false.
		
		String nome = "Gabriel";
		int idade = 18;
		double altura = 1.85;
		char genero = 'M';
		
		System.out.println("Algumas informa��es sobre mim:");
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("G�nero: " + genero);
		System.out.println();
		System.out.println("Resumindo...");
		System.out.printf("Meu nome � %s, tenho %d anos, sou do sexo Masculino (%c). Tenho %.2f m de altura.\n", 
				nome, idade, genero, altura);
		System.out.println();
		System.out.println("Criando programa pra calcular a m�dia entre dois n�meros:");
		int x, y, media;
		x = 81;
		y = 21;
		media = (x + y) / 2;
		System.out.printf("A m�dia entre %d e %d � %d.\n", x, y, media);
	}

}

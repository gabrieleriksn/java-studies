package studies;
import java.util.Locale;

public class processamento_de_dados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int x, y, soma;
		x = 1;
		y = 22;
		soma = x + y;
		System.out.printf("A soma entre %d e %d � %d.\n", x, y, soma);
		// Isso aqui � o que chamamos de processamento de dados em Java.
		// Temos, tipicamente, uma vari�vel e uma express�o.
		// A express�o � processada e o seu resultado � armazenado na mem�ria da vari�vel.
		// <vari�vel> = <express�o> (Sintaxe padr�o).
		
		System.out.println();
		System.out.println("Calculando a �rea de um trap�zio.");
		int baseMenor, baseMaior, altura;
		double area;
		baseMenor = 2;
		baseMaior = 19;
		altura = 3;
		area = (double) (baseMenor + baseMaior) * altura / 2.0;
		System.out.println("Em um trap�zio com as seguintas dimens�es:");
		System.out.println("Base maior: " + baseMaior + " metros.");
		System.out.println("Base menor: " + baseMenor + " metros.");
		System.out.println("Altura: " + altura + " metros.");
		System.out.printf("Temos que a �rea equivale a %.2f metros.%n", area);
		
		// IMPORTANTE: PODE ACONTECER DE, AO DIVIR INTEIROS, O COMPILADOR FORNECER A DIVIS�O INTEIRA
		// SEM CASAS DECIMAIS. COMO RESOLVER?
		// COLOCAR (double) na frente da divis�o. Dese modo, vai fornecer o valor em double mesmo.
		
		// Esse processo � chamado de casting, equivale a uma convers�o expl�cita de dados.
		// Exemplo
		System.out.println();
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = (double) a / b;
		System.out.println(resultado);
		double a_dois = 2.9;
		int b_dois;
		b_dois = (int) a_dois;
		System.out.println(b_dois);
		char letra = 'A';
		System.out.println(letra);
	}

}

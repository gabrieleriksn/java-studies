package studies;
import java.util.Scanner;
import java.util.Locale;

public class entrada_de_dados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Para ler uma palavra usamos sc.next()
		
		String nome; 
		
		System.out.println("Forne�a o seu nome:");
		nome = sc.nextLine();
		
		System.out.println("Seja bem vindo, " + nome + "!");
		
		// Para ler um inteiro usamos sc.nextInt()
		
		int a, b, soma;
		
		System.out.println("Forne�a dois inteiros para serem somados:");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.printf("A soma entre %d e %d � %d.%n", a, b, soma);
		
		// Para ler um float usamos sc.nextDouble()
		double altura;
		
		System.out.println("Forne�a a sua altura:");
		
		altura = sc.nextDouble();
	
		System.out.println("A sua altura � " + altura + " metros");
		
		// Para ler um char usamos sc.next().charAt(0)
		System.out.println("Forne�a um caractere");
		char letra;
		letra = sc.next().charAt(0);
		System.out.println("A letra que voc� fornceu foi: " + letra);
		sc.close();
		
		// OBS: D� PRA LER V�RIOS DADOS NA MESMA LINHA SE SEPAR�-LOS COM ESPA�O.
		
		// Como ler dados at� a quebra de linha? sc.nextLine()
		
	}

}

package studies;
import java.util.Scanner;
import java.util.Locale;

public class funcoes_matematicas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Tr�s fun��es essencias s�o implementadas da seguinte maneira:
		// Raiz quadrada: Math.sqrt(x), onde x � o valor que queremos descobrir a raiz quadrada
		// Pot�ncia: Math.pow(x, y), x elevado a y
		// M�dulo de um n�mero: Math.abs(x)
		double x, y, z, w, raizUm, potenciaUm, moduloUm;
		x = 9.0;
		y = 2.0;
		z = 10;
		w = -28.0;
		raizUm = Math.sqrt(x);
		potenciaUm = Math.pow(y, z);
		moduloUm = Math.abs(w);
		System.out.printf("A raiz quadrada de %.1f � %.1f.%n", x, raizUm);
		System.out.printf("%.1f elevado a %.1f � igual a %.1f.%n", y, z, potenciaUm);
		System.out.printf("O m�dulo de %.1f � %.1f.%n", w, moduloUm);
		
		System.out.println();
		System.out.println("Implementando A f�rmula de b�skhara.");
		double a, b, c, delta, xUm, xDois;
		System.out.println("Forne�a os valores de a, b e de c separados por espa�o:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		delta = Math.pow(b, 2.0) - 4.0 * a * c;
		xUm = (-b + Math.sqrt(delta)) / (2.0 * a);
		xDois = (-b - Math.sqrt(delta)) / (2.0 * a);
		System.out.printf("x1 vale %.2f e x2 vale %.2f.%n", xUm, xDois);
		sc.close();
	}

}

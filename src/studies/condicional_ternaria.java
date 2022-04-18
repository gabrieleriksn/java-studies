package studies;
import java.util.Locale;
import java.util.Scanner;

public class condicional_ternaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Express�o Condi�ional Tern�ria:
		// Forma usual...
		
		double valor, desconto;
		
		valor = sc.nextDouble();
		
		if (valor >= 100.0) {
			desconto = valor * 0.1;
		}
		
		else {
			desconto = valor * 0.05;
		}
		
		System.out.println(desconto);
		
		// Usando a express�o condicional tern�ria:
		// variavel = (<condi��o>) ? <valor_caso_verdade> : <valor_caso_falsa>;
		
		desconto = (valor >= 100.0) ? (valor * 0.1) : (valor * 0.05);
		
		// A leitura fica bem maix enxuta !!!
		
		System.out.println(desconto);
		
		sc.close();
	}

}

package studies;
import java.util.Locale;

public class exemplo_saida_de_dados {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Offce desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products");
		System.out.printf("%s which price is R$ %f%n", product1, price1);
		System.out.printf("%s which price is R$ %f%n", product2, price2);
		System.out.printf("%d yeard old, code %d and gender %c%n", age, code, gender);
		System.out.printf("Measure whit eight decimal places: %f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}

}

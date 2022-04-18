package studies;
import java.util.Scanner;

public class estruturas_condicionais_e_logicas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horas;
		
		// Aqui estudaremos sobre estruturas l�gicas e condicionais em Java
		// Pois ser� atrav�s delas que poderemos usar if, else, else if, etc
		
		// >  (maior)
		// <  (menor)
		// >= (maior igual)
		// <= (menor igual)
		// == (igual)
		// != (diferente)
		
		// || (or/ou)
		// && (and/e)
		// !  (not/n�o)
		
		System.out.println("Que horas s�o?");
		
		horas = sc.nextInt();
		
		// no Java n�o tem elif '0'
		// Como resolver o problema quando temos mais de duas possibilidades?
		// Lembre-se de que o elif � um else if, ou seja, um if dentro de um else
		// � isso que faremos aqui. dentro do else encaixos if's :D
		// Ou � s� colocar else if na verdade...
		
		if (horas >= 4 && horas < 13) {
			System.out.println("Bom dia!");
		}
		
		else if (horas >= 13 && horas < 18) {
			System.out.println("Boa tarde!");
		}
		
		else {
			System.out.println("Boa noite!");
		}
		
		
		sc.close();
	}

}

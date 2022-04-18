package aplications;

import java.util.Scanner;
import entities.Cliente;

public class aplication_cliente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Forneça os dados do cliente:");
		String nome = sc.nextLine();
		int idade = sc.nextInt();
		String sexo = sc.next();
		sc.nextLine();
		
		Cliente cliente = new Cliente(nome, idade, sexo);
		
		System.out.println("Os dados fornecidos foram:");
		cliente.dados();
		
		sc.close();
	}

}

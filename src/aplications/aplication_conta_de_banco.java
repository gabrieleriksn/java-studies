package aplications;

import java.util.Scanner;
import java.util.Locale;
import entities.ContaBancaria;

public class aplication_conta_de_banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria contaDoBanco;
		
		String numeroDaConta, nomeDoTitular;
		double depositoInicial;
		
		System.out.print("Enter account number: ");
		numeroDaConta = sc.nextLine();
		
		System.out.print("Enter account holder: ");
		nomeDoTitular = sc.nextLine();
		
		System.out.print("Is there a initial deposit (y/n)? ");
		char res = sc.next().charAt(0);
		
		if (res == 'y') {
			System.out.print("Enter initial deposit value: ");
			depositoInicial = sc.nextDouble();
			contaDoBanco = new ContaBancaria(nomeDoTitular, numeroDaConta, depositoInicial);
	 	}
		
		else {
			contaDoBanco = new ContaBancaria(nomeDoTitular, numeroDaConta);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(contaDoBanco);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		
		double deposito = sc.nextDouble();
		contaDoBanco.deposito(deposito);
		
		System.out.println("Update account data:");
		System.out.println(contaDoBanco);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		
		double saque = sc.nextDouble();
		contaDoBanco.saque(saque);
		
		System.out.println("Update account data:");
		System.out.println(contaDoBanco);
		
		sc.close();
	}

}

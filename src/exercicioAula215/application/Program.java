package exercicioAula215.application;

import java.util.Scanner;
import java.util.Locale;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import exercicioAula215.entities.Contract;
import exercicioAula215.entities.Installment;
import exercicioAula215.services.ContractService;
import exercicioAula215.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data");
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		ContractService contractService = new ContractService(new PaypalService());
		
		System.out.print("Enter number of installments: ");
		int numberOfInstallments = sc.nextInt();

		contractService.processContract(contract, numberOfInstallments);
		
		System.out.println("Installments:");
		
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}

}

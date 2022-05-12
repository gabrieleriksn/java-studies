package exercicioAula220.applications;

import java.security.InvalidParameterException;
import java.util.Locale;
import java.util.Scanner;
import exercicioAula220.services.BrazilInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BrazilInterestService br = new BrazilInterestService(2.0);
		
		try {
			System.out.print("Amount: ");
			double amount = sc.nextDouble();
			System.out.print("Months: ");
			int months = sc.nextInt();
			double payment = br.payment(amount, months);
			System.out.println("Payment after " + months + " months:");
			System.out.println(String.format("%.2f", payment));
		}
		catch (InvalidParameterException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}

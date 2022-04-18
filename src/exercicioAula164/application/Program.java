package exercicioAula164.application;

import exercicioAula164.exception.BalanceException;
import exercicioAula164.entities.Account;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter account data");

            System.out.print("Number: ");
            int number = sc.nextInt();

            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);

            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        }
        catch (BalanceException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected error.");
        }
        finally {
            sc.close();
        }
    }
}

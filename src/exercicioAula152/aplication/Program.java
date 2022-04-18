package exercicioAula152.aplication;

import java.util.Locale;
import java.util.Scanner;
import exercicioAula152.entities.TaxPayer;
import exercicioAula152.entities.LegalPayer;
import exercicioAula152.entities.PhysicalPayer;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        
        TaxPayer[] taxPayersVect = new TaxPayer[n]; 
        for (int i=0; i<n; i++) {
            sc.nextLine();
            
            System.out.printf("Tax payer #%d data:%n", i+1);
            
            System.out.print("Individual or company (i/c)? ");
            Character res = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if (res.equals('i')) {
                System.out.print("Health expenditures: ");
                double healthSpending = sc.nextDouble();
                
                TaxPayer taxPayer = new PhysicalPayer(name, annualIncome, healthSpending);
                taxPayersVect[i] = taxPayer;
            }

            else if (res.equals('c')) {
                System.out.print("Number of employees: ");
                int employeesNumber = sc.nextInt();
                
                TaxPayer taxPayer = new LegalPayer(name, annualIncome, employeesNumber);
                taxPayersVect[i] = taxPayer;
            }
        }

        System.out.println();
        
        System.out.println("TAXES PAID:");
        double sum = 0;
        for (TaxPayer taxPayer : taxPayersVect) {
            System.out.println(taxPayer);
            sum += taxPayer.tax();
        }
        
        System.out.println();
        
        System.out.println("TOTAL TAXES : $ " + String.format("%.2f", sum));

    sc.close();
    }
}

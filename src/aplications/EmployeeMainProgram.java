package aplications;

import java.util.Scanner;
import java.util.Locale;
import entities.EmployeeRf;
import entities.OutsourcedEmployeeRf;
import java.util.List;
import java.util.ArrayList;

public class EmployeeMainProgram {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<EmployeeRf> employeesList = new ArrayList<>();
        for (int i=0; i<n; i++) {
            System.out.printf("Employee #%d data:%n", i+1);
            
            System.out.print("Outsoucerd (y/n)? ");
            Character res = sc.next().charAt(0);
            
            sc.nextLine();
            
            System.out.print("Name: ");
            String name = sc.nextLine();
                    
            System.out.print("Hours: ");
            int hours = sc.nextInt();
                    
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            
            if (res.equals('n')) {
                EmployeeRf employeeNotOutSourced = new EmployeeRf(name, hours, valuePerHour);
                employeesList.add(employeeNotOutSourced);
            }

            else if (res.equals('y')) {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                
                EmployeeRf employeeOutSourced = new OutsourcedEmployeeRf(name, hours, valuePerHour, additionalCharge);
                employeesList.add(employeeOutSourced);
            }
        }

        System.out.println();
            
            System.out.println("PAYMENTS:");

            for (EmployeeRf employee : employeesList) {
                System.out.println(employee);
            }

        sc.close();
    }
}

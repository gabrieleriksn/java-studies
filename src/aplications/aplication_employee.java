package aplications;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class aplication_employee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n", emp.name, emp.netSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double p = sc.nextDouble();
		
		emp.increaseSalary(p);		
		
		System.out.println();
		System.out.printf("Update data: %s, $ %.2f", emp.name, emp.netSalary());
		
		sc.close();
	}

}

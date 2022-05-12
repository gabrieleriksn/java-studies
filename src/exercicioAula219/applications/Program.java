package exercicioAula219.applications;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import exercicioAula219.entities.Employee;


public class Program {
	
	public static void main(String[] args) {
		String path = "C:\\Temp\\in.txt";
		List<Employee> employees = processEmployees(path);
		Collections.sort(employees);
		showEmployees(employees);
	}
	
	public static List<Employee> processEmployees(String path) {
		List<Employee> employees = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				String[] s = line.split(",");
				Employee employee = new Employee(s[0], Double.parseDouble(s[1]));
				employees.add(employee);
			}
			
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		return employees;
	}
	
	public static void showEmployees(List<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee.getName() + ", " + employee.getSalary());
		}
	}
}

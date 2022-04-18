package aplications;

import java.util.Scanner;
import java.util.Locale;
import entities.Funcionario;
import java.util.List;
import java.util.ArrayList;


public class aplication_funcionarios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		
		List<Funcionario> listaDeFuncionarios = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			
			System.out.println();
			
			System.out.printf("Employee #%d:%n", i+1);
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while (idExistente(listaDeFuncionarios, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			
			listaDeFuncionarios.add(funcionario);
		}
		
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		
		boolean idExistente = idExistente(listaDeFuncionarios, id);
		/*
		for (Funcionario funcionario : listaDeFuncionarios) {
			if (funcionario.getId() == id) {
				idExistente = true;
				break;
			}
		}
		*/
		
		if (idExistente) {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
		
			for (Funcionario funcionario : listaDeFuncionarios) {
				if (funcionario.getId() == id) {
					funcionario.aumentarSalario(percentage);
				}
			}
		}
		
		else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		
		System.out.println("List of employees:");
		for (Funcionario funcionario : listaDeFuncionarios) {
			System.out.println(funcionario);
		}
	
		sc.close();
	}
	
	public static Boolean idExistente(List<Funcionario> listaDeFuncionarios, int id) {
		for (Funcionario funcionario : listaDeFuncionarios) {
			if (funcionario.getId() == id) {
				return true;
			}
		}
		return false;
	}

}

package exercicioAula219.entities;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private Double salary;
	
	public Employee() {
	}
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void increaseSalary(double amount) {
		salary += amount;
	}
	
	public void decreaseSalary(double amount) {
		salary -= amount;
	}
	
	@Override
	public int compareTo(Employee other) {
		return -salary.compareTo(other.getSalary());
	}
}

package entities;

public class Student {
	
	public String nome;
	public double notaUm;
	public double notaDois;
	public double notaTres;
	
	public double notaFinal() {
		return notaUm + notaDois + notaTres;
	}
	
	public double quantosPontosFaltam() {
		double nota = notaFinal();  
		return 60 - nota; 
	}
}

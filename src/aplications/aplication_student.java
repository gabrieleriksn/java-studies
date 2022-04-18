package aplications;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class aplication_student {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		double notaFinal, quantosPontosFaltam;
		
		aluno.nome = sc.nextLine();
		aluno.notaUm = sc.nextDouble();
		aluno.notaDois = sc.nextDouble();
		aluno.notaTres = sc.nextDouble();
		
		notaFinal = aluno.notaFinal();
		System.out.printf("FINAL GRADE = %.2f%n", notaFinal);
		
		if (notaFinal >= 60) {
			System.out.println("PASS");
		}
		
		else {
			quantosPontosFaltam = aluno.quantosPontosFaltam();
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", quantosPontosFaltam);
		}
		
		sc.close();
	}

}

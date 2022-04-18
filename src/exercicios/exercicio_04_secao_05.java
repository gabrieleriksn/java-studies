package exercicios;
import java.util.Scanner;

public class exercicio_04_secao_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		duracao = (horaFinal <= horaInicial) ? ((24 - horaInicial) + horaFinal) : (horaFinal - horaInicial);
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}

}

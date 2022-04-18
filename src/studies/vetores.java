package studies;

import java.util.Scanner;
import java.util.Locale;

public class vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		/*
		 * VETORES
		 * 
		 * Instanciação:
		 * <tipoDeDados>[] <nomeDoVetor> = new <tipoDeDados>[quantidadeDeDados];
		 * 
		 * 
		 * Em programa��o, vetor � o nome dado a arranjos unidimensionais.
		 * 
		 * Arranjo (Array) � uma estrutura de dados:
		 * - Homog�nea (Dados do mesmo tipo)
		 * - Ordenada (Elementos s�o acessados por meio de posi��es)
		 * - Alocada de uma s� vez, em um bloco cont�guo de mem�ria
		 * 
		 *  Vantagens:
		 *  - Acesso imediato aos elementos por meio de suas posi��es
		 *  
		 *  Desvantagens:
		 *  - Tamanho fixo;
		 *  - Dificuldade para se realizar dele��es e inser��es.
		 * 
		 */
		
		int qtdDeAlturas = sc.nextInt();
		double[] vetor = new double[qtdDeAlturas];
		
		
		for (int i = 0; i < qtdDeAlturas; i += 1) {
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		double media = soma / vetor.length;
		
		System.out.println("Average: " + String.format("%.2f", media));
		
		sc.close();
	}

}

package studies;

public class for_each {

	public static void main(String[] args) {
		/*
		 * La�o "for each"
		 * 
		 * � basicamente o for elemento de python
		 * 
		 * for (<tipo> <apelido_para_cada_elemento> : <cole��o>) {
		 * 		bloco de comandos
		 * }
		 * 
		 */
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"}; 
		
		// for each == for elemento
		for (String nome : vect) {
			System.out.println(nome);
		}

		
		// for normal == for indice
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		
		
	}

}

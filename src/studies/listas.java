package studies;
import java.util.List;
import java.util.ArrayList;



public class listas {

	public static void main(String[] args) {
		
		/*
		 * LISTAS
		 * 
		 * A lista � uma estrutura de dados:
		 * - Homog�nea (dados do mesmo tipo)
		 * - Ordenada (elementos acessados por meio de posi��es) 
		 * - Inicia vazia e seus elementos s�o alocados sob demanda
		 * - Cada elemento ocupa um n� (ou nodo) da lista
		 * 
		 * Tipo (interface): List - � diferente de ser Classe
		 * Classes que implementam: ArrayList, LinkedList, etc
		 * 
		 * Vantagens:
		 * - Tamanho vari�vel
		 * - Facilidade de inser��es e de dele��es
		 * 
		 * Desvantagens:
		 * - Acesso sequencial aos elementos*
		 * 
		 * 
		 * 
		 * 
		 * DEMO:
		 * 
		 * Como fazer acesso indexado em lista ?? lit.get(index)
		 * 
		 * Tamanho da lista: list.size() == len()
		 * 
		 * Inserir elemento na lista: list.add(obj)  == append, list.add(int, obj) == insert
		 * 
		 * Remover elementos da lista: list.remove(obj), list.remove(int), list.removeIf(Predicate)
		 * 
		 * Encontrar posi��o de elemento: list.indexOf(obj); list.lastIndexOf(obj) // Sei implementar
		 * Quando o indexOf n�o encontra o elemento ele retorna -1
		 * 
		 * Filtrar lista com base em predicado: // Sei implementar
		 *   - List<Integer> result = list.stream().filter(x -> x > 4).collect(Colector.toList()); 
		 * 
		 * Encontrar primeira ocorr�ncia com base em predicado: // Sei implementar
		 *   - Integer result = list.stream.filter(x -> x > 4).findFirst().orElse(null);
		 * 
		 */
		
		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Gabriel");
		list.add("Bernadete"); // append
		list.add("Solange");
		list.add(2, "Florisvaldo"); // insert
		list.add("Marinaldo");
		
		for (String nome : list) {
			System.out.println(nome);
		}
		
		System.out.println();
		
		// System.out.println(list.size()); // len
		
		list.remove("Bernadete"); // Funciona como o pop, mas, al�m do index, pode receber o elemento.
		
		for (String nome : list) {
			System.out.println(nome);
		}
		
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).equals("Marinaldo")) {
				list.remove(i);
			}
		}
		 
		System.out.println();
		
		for (String nome : list) {
			System.out.println(nome);
		}
		
		System.out.println();
		
		System.out.println(list.indexOf("Solange"));
		System.out.println(list.indexOf("Antonio"));
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).equals("Solange")) {
				System.out.println(i);
			}
		}
		
		list.add("Sabrina");
		list.add("Soraia");
		list.add("Souto");
		
		System.out.println();
		
		for (String nome : list) {
			System.out.println(nome);
		}
		
		
		// removeIf - implementa��o.
		
		// list.removeIf(x -> x.charAt(0) == 'S');
		
		for (int i=list.size() - 1; i>=0; i--) {
			if (list.get(i).charAt(0) == 'S') {
				list.remove(list.get(i));
			}
		}
		
		System.out.println();
		
		for (String nome : list) {
			System.out.println(nome);
		}
		
	}

}

package studies;

public class boxing_unboxing_wrapper {

	public static void main(String[] args) {
		/*
		 * Boxing (Encaixotamento)
		 * - Equivale a guardar um tipo primitivo como um objeto no Heap.
		 * 
		 * 
		 * Unboxing (Desencaixotamento)
		 * - Equivale a trazer o tipo primitivo que est� guardado como um objeto
		 * no Heap para o Stack.
		 * 
		 * Wrappers
		 * - S�o classes equivalentes aos tipos primitivos
		 * - Boxing e Unboxing s�o coisas naturais dal inguagem
		 * - Uso comum: campos de entidades de sistemas de informa��o 
		 *   (Pois tipos refer�ncia (classes) aceitam valor null e usufruem de OO.)
		 *
		 * Tipo referência ---------- Tipo valor
		 *      Byte                     byte
		 *      Short                    short
		 *      Integer                  int
		 *      Long                     long
		 *      Boolean                  boolean
		 *      Float                    float
		 *      Double                   double
		 *
		 * Object é a classe geral e ela tem 3 subclasses: Number, Boolean e Character.
		 * Number tem outras subclasses: Byte Short Integer Long Float Double
		 */

		
		int x = 20;
		
		// Boxing
		Integer obj = x;
		
		System.out.println(obj);
		
		// Unoboxing
		int y = obj;
		
		System.out.println(y);
	}

}

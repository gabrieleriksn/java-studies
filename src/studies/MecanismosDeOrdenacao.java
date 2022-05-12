package studies;

public class MecanismosDeOrdenacao {

	public static void main(String[] args) {
		// Arquivo criado para fazer testes com os mecanismos de ordenacao
		// utilizando vetores/arrays.
		
		// Bubble sort
		int[] nums = new int[] {12, 2, 23, 5, 4, 1};
		bubbleSort(nums);
		showNums(nums);
	}
	
	public static void bubbleSort(int[] vect) {
		for (int j = 0; j < vect.length; j ++) {
			boolean swapped = false;
			for (int i = 0; i < vect.length - 1 - j; i++) {
				if (vect[i] > vect[i + 1]) {
					int temp = vect[i];
					vect[i] = vect[i + 1];
					vect[i + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				return;
			}
		}
	}
	public static void showNums(int[] vect) {
		for (int num : vect) {
			System.out.println(num);
		}
	}
}

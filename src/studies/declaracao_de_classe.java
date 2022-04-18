package studies;
import entities.Triangle;

public class declaracao_de_classe {

	public static void main(String[] args) {
		//Como fazemos a declara��o de um objeto a uma Classe???
		Triangle x = new Triangle();
	 // <Classe> <Objeto> = <instancia��o>;
		
		x.a = 3;
		x.b = 4;
		x.c = 5;
		
		double y = x.area();
		
		System.out.println(y);
	}

}

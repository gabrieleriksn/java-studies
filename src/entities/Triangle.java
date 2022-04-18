package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}

/*
Quais s�o os benef�cios de se calcular, por exemplo, a �rea de um tri�ngulo
por meio de um m�todo que est� dentro da classe?

1) Reaproveitamento de c�digo. Evitamos a repeti��o de c�digo ao usar m�todos
j� prontos.

2) Delega��o de responsabilidade. Se o objetivo � calcular a �rea de um
Tri�ngulo � fun��o da classe tri�ngulo calcular essa �rea e, n�o, da
classe c�rculo, por exemplo.

Sempre antes de criarmos uma Classe � importante sabermos a estrutura��o l�gica
dela.

1) Tipo da Classe (Product, Triangle, Pedido ...);
2) Atributos que estar�o dentro da Classe;
3) M�todos pertencentes � Classe.


package entities; (Pacote com classes relacionadas)

public class Triangle {
	
	public double a; (Atributos da nossa Classe)
	public double b; (Atributos da nossa Classe)
	public double c; (Atributos da nossa Classe)
	
	Por que usamos o public??? Para indicar que podemos usar em outros arquivos. 
	
	public double area() { Por que n�o informamos nenhum par�metro no m�todo??
		double p = (a + b + c) / 2.0; Pois estamos usando os atributos que j� est�o na Classe.
		a = Math.sqrt(p * (p - a) * (p - b) * (p - c));		
		
		return a;
	}
}


*/
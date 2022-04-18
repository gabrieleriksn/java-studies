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
Quais são os benefícios de se calcular, por exemplo, a área de um triângulo
por meio de um método que está dentro da classe?

1) Reaproveitamento de código. Evitamos a repetição de código ao usar métodos
já prontos.

2) Delegação de responsabilidade. Se o objetivo é calcular a área de um
Triângulo é função da classe triângulo calcular essa área e, não, da
classe círculo, por exemplo.

Sempre antes de criarmos uma Classe é importante sabermos a estruturação lógica
dela.

1) Tipo da Classe (Product, Triangle, Pedido ...);
2) Atributos que estarão dentro da Classe;
3) Métodos pertencentes à Classe.


package entities; (Pacote com classes relacionadas)

public class Triangle {
	
	public double a; (Atributos da nossa Classe)
	public double b; (Atributos da nossa Classe)
	public double c; (Atributos da nossa Classe)
	
	Por que usamos o public??? Para indicar que podemos usar em outros arquivos. 
	
	public double area() { Por que não informamos nenhum parâmetro no método??
		double p = (a + b + c) / 2.0; Pois estamos usando os atributos que já estão na Classe.
		a = Math.sqrt(p * (p - a) * (p - b) * (p - c));		
		
		return a;
	}
}


*/
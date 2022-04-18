package studies;

public class tipos_referencia_e_valor {

	public static void main(String[] args) {
		 
		/*
		 * TIPOS REFER�NCIA 
		 * 
		 * (N�o alocam o Objeto em si, mas sim um endere�o que o referencia)
		 * 
		 * Vari�veis cujo tipo s�o classes. N�o devem ser entendidos como caixas, mas sim
		 * como ponteiros que apontam para outras caixas.
		 * 
		 * Resumindo... no Stack (Mem�ria de execu��o principal) temos caixas que v�o guardar
		 * endere�os de memm�ria que v�o apontar para o Heap que vai ser onde estaram ver
		 * dadeiramente os valores dos atributos da classe.
		 * 
		 * OBS: os tipos refer�ncia aceitam o valor null, ele existe quando um objeto � instanciado,
		 * mas n�o s�o fornecidos os valores dos seus atributos no construtor.
		 * 
		 * Os valores padr�o s�o:
		 * - N�meros = 0
		 * - Boolean = false
		 * - Char    = caractere c�digo 0
		 * - Objeto  = null
		 * 
		 * Se dizemos que x = y, dizemos que x e y apontam para as mesmas caixas do heap
		 * 
		 * 
		 * 
		 * TIPOS PRIMITIVOS S�O TIPO VALOR 
		 * 
		 * Tipos valor s�o as pr�prias caixas e n�o os ponteiros
		 * 
		 * Na pr�pria stack os valores estar�o guardados, isto �, n�o haver� um ponteiro apontando
		 * pra outro canto onde estariam alocados.
		 * 
		 * Obviamente, os tipos primitivos precisam ser iniciados, n�o armazem o tipo null.
		 * 
		 * Se dizemos que x = y, copiamos o valor de y para x, isto �, � criada uma nova
		 * caixa no steack.
		 * 
		 * 
		 * 
		 * 
		 * DIFEREN�AS:
		 * 
		 * CLASSE: USUFRUI DE TODOS OS RECURSOS DE OOO
		 * PRIMITIVO: MAIS SIMPLES E MAIS PERFORM�TICO
		 * 
		 * CLASSE: VARI�VEIS S�O PONTEIROS
		 * PRIMITIVO: VARI�VEIS S�O CAIXAS
		 * 
		 * CLASSE: PRECISAM SER INSTANCIADOS USANDO NEW, OU APONTAR PARA UM OBJETO J� EXISTENTE
		 * PRIMITIVO: N�O PRECISAM SER INSTANCIADOS, UMA VEZ DECLARADOS EST�O PRONTOS PARA USO
		 * 
		 * CLASSE: ACEITA VALOR NULL
		 * PRIMITIVO: N�O ACEITA VALOR NULL
		 * 
		 * CLASSE: OBJETOS INSTANCIADOS NO HEAP, POIS NO STEACK TEREMOS UM PONTEIRO
		 * PRIMITIVO: "OBJETO" INSTANCIADO NO STEACK
		 * 
		 * CLASSE: OBJETOS N�O UTILIZADOS S�O DESALOCADOS EM UM MOMENTO PR�XIMO PELO 
		 * GARBAGE COLLECTOR.
		 * PRIMITIVO: "OBJETOS" S�O DESALOCADOS IMEDIATAMENTE QUANDO SEU ESCOPO DE EXECU��O 
		 * � FINALIZADO.
		 */
	}
	

}

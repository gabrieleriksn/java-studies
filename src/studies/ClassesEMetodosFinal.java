package studies;

public class ClassesEMetodosFinal {
    public static void main(String[] args) {
        /*
        
        A palvra Chave FINAL.

        Serve, então, para proibir derivações de classes e sobreposições de métodos
        além daqueles já estabelecidos na própria classe.

        Para Classe: Evita que a classe seja herdada.
        Para Métodos: Evita que o método seja sobreposto.

        Qual o motivo de utilizarmos a palvra "final"??

        SEGURANÇA: Dependendo das regras do negócio, as vezes é desejável garantir que uma classe
        não seja herdada. ou que um método não seja sobreposo.
        - Geralmente convém acrescentar "final" em métodos sobrepostos, pois sobreposições múltiplas
        podem ser uma porta de entrada para incosistências.

        PERFORMANCE: Atributos de tipo de uma classe final são analisados de forma mais rápida 
        em tempo de execução.
        - Exemplo clássico: String.

        */
    }

}

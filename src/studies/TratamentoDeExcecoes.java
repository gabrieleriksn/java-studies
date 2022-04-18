package studies;

public final class TratamentoDeExcecoes {
    public static void main(String[] args) {
        /*
        TRATAMENTO DE EXCEÇÕES EM JAVA

        EXCEÇÃO ???
        - Uma exceção é qualquer condição de erro ou comportamento inesperado
        encontrado por um programa em execução. (É realmente uma exceção, já
        que se entende que o normal é que o programa esteja em funcionamento).
        
        - Em Java, uma Exceção é um objeto herdado da classe:
          . java.lang.Exception - o compilador obriga a tratar ou propagar
          . java.lang.RunTimeException - o compilador não obriga a tratar ou propagar
        
        - Quando lançada, uma exceção é propagada na pilha de chamadas de métodos
        em execução, até que seja capturada (tratada) ou o programa seja encerrado.

        A SuperClass é Throwable e as SubClass são Error e Exception
        - Error tem como subclasses OutOfMemory, VirtualMachineError, ... (Coisas que, 
        geralmente não somos responsáveis por tratar).
        - Exception tem como subclasses IOException, RunTimeException (IndexOutBoundsException, 
        NullPointerException). As quais são de nossa responsabilidade ver o que está dando
        errado e tratar.

        POR QUE EXCEÇÕES ???

        O modelo de tratamento de exceções permite que erros sejam tratados de forma
        consiste, elegante e flexível, usando boas práticas.

        (LOGO, ESSA PARTE DO ASSUNTO É MUITO IMPORTANTE !!!)

        Vantagens:
          . Delega a lógica de erro para a classe responsável por conhecer as
          regras que podem ocasionar erro;
          . Trata de forma organizada (Inclusive hierárquica) exceções de tipos
          diferentes;
          . A execução pode carregar dados quaisquer.

        TÓPICOS:
          . Try - Catch;
          . e.printStackTrace // É fornecido o mapeamento da exceção.;

        É sempre bom tratar as exceções no comecinho do método - Programação Defensiva
        pois é uma boa prática de programação.

        Termos importantes: throws, throw, try-catch, finally.
        Sempre que uma exceção é lançada (throw) ela deve ser tratada ali mesmo ou
        pode ser propagada(throws) para a próxima execução da pilha do stack, por exemplo
        póde ser que o seu tratamento esteja na main, então ela será tratatada lá.
        Na main teremos o sitema try-catch, try significa dizer que o programa tentará exe
        cutar o programa totalmente se houver, durante esse execução, o lançamento
        no try de alguma exceção por algum método das classes ela deverá ser capturada (catch)
        pelos mecanismos já estabelecidos na main.

        Na dúvida podemos sempre instanciar um catch genérico para tratar alguma exceção
        inesperada, já que ele tbm é uma SuperClasse e será feito um processo de UpCasting!!!
        */
    }
}
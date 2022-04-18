package studies;

public class ClassesAbstratas {
    public static void main(String[] args) {
        /*
        CLASSES ABSTRATAS
        - São classes que não podem ser instanciadas
        - É uma forma de garantir herança total: somente subclasses não abstra
        tas podem ser instanciadas , mas nunca a superclasse abstrata.
        
        Exemplo: Na criação do sistema de contas do banco feito anteriomente
        usamos três Classes (Account, SavingsAccount, BusinessAccount).
        Supondo que um banco só permite criação de contas SavingsAccount
        e BusinessAccount para atualizar o programa devemos tornar a classe
        Account Abstrata, pois assim ela não poderá ser instanciada,
        apenas suas subclasses (SavingsAccount e BusinessAccount) o podem.
       
        Como fazemos isso?
        É só adicionar abstract na declaração da classe:

        public abstract class Account {
            ...
        }

        QUESTIONAMENTO

        Se a classe Account não pode ser intanciada, por que simplesmente não criar somente
        SavingsAccount e BusinessAccount????

        RESPOSTA

        - Reuso;
        - Polimorfismo // A superclasse classe genérica nos permite tratar de forma fácil
        e uniforme todos os tipos de conta, inclusive com polimorfismo se for o caso
        (como fizemos nos últimos exercícios). Por exemplo, você pode colocar todos os
        tipos de contas em uma mesma coleção. 

        Na notação UML fica em itálico o nome de uma classe abstrata.

        */
    }
}

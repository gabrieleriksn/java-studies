package studies;

public class UpCastingDownCasting {
    public static void main(String[] args) {
        /*

        UpCasting;
        - Casting da subclasse para a superclasse
        - uso comum é em polimorfismo
        Como a sub classe é uma superclasse, não temos problema em convertê-la para
        a super, uma vez que ela tem todos os dados e comportamentos da sua super além
        daqueles específicos que ela possui.


        DownCasting:
        - Casting da Superclasse para a subclasse
        - Palavra instanceof;
        - Uso comum: métodos que recebem parâmetros genéricos (ex: Equals).
        Como uma subclasse têm além dos dados e comportamentos genéricos métodos específicos
        pode haver problema em convertert de Superclasse para subclasse. Pra saber se a
        conversão é possível devemos realizar uam checagem com instanceof, ou seja, se
        a superclasse for na verdade uma subclasse ela pode passar pelo casting!

        */
    }
}